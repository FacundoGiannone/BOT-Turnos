setTimeout(() => {
  const loadingDiv = document.getElementById('loading');
  const errorDiv = document.getElementById('error');
  const table = document.getElementById('characterTable');
  const tbody = document.getElementById('characterBody');


  fetch('http://localhost:8080/turno')
    .then(response => {
      if (!response.ok) {
        throw new Error('❌ No se pudo cargar la lista de turnos.');
      }
      return response.json();
    })
    .then(data => {
      loadingDiv.style.display = 'none';

      data.forEach(turno => {
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${turno.id}</td>
          <td>${turno.fecha}</td>
          <td>${turno.hora}</td>
          <td>${turno.usuario.apellido+" "+turno.usuario.nombre}</td>
          <td>${turno.profesional.apellido+" "+turno.profesional.nombre}</td>
          <td>${turno.servicio.nombre }</td>
          <td>${turno.estado}</td>
        `;
        tbody.appendChild(row);
      });

      table.style.display = 'table';
    })
    .catch(error => {
      loadingDiv.style.display = 'none';
      errorDiv.innerText = error.message;
      console.error("❌ Error en fetch:", error);
    });
}, 100);

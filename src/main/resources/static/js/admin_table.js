setTimeout(() => {
  const loadingDiv = document.getElementById('loading');
  const errorDiv = document.getElementById('error');
  const table = document.getElementById('characterTable');
  const tbody = document.getElementById('characterBody');


  fetch('http://localhost:8080/admin')
    .then(response => {
      if (!response.ok) {
        throw new Error('❌ No se pudo cargar la lista de admins.');
      }
      return response.json();
    })
    .then(data => {
      loadingDiv.style.display = 'none';

      data.forEach(admin => {
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${admin.id}</td>
          <td>${admin.nombre}</td>
          <td>${admin.apellido}</td>
          <td>${admin.usuario}</td>
          <td>${admin.contraseña}</td>
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

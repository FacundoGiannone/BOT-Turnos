const API_URL = 'http://localhost:8080/servicio'; // Cambiar si es necesario

document.addEventListener('DOMContentLoaded', () => {
	
	const loadingDiv = document.getElementById('loading');
  const errorDiv = document.getElementById('error');
  const table = document.getElementById('characterTable');
  const tbody = document.getElementById('characterBody');

  fetch(API_URL)
    .then(response => {
      if (!response.ok) {
        throw new Error('No se pudo cargar la lista de personajes.');
      }
      return response.json();
    })
    .then(data => {
      loadingDiv.style.display = 'none';

      data.forEach(servicio => {
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${servicio.id}</td>
          <td>${servicio.nombre}</td>
          <td>${servicio.precio}</td>
        `;
        tbody.appendChild(row);
      });

      table.style.display = 'table';
    })
    .catch(error => {
      loadingDiv.style.display = 'none';
      errorDiv.innerText = error.message;
    });
});

setTimeout(() => {
	const loadingDiv = document.getElementById('loading');
	const errorDiv = document.getElementById('error');
	const table = document.getElementById('characterTable');
	const tbody = document.getElementById('characterBody');


	fetch('http://localhost:8080/usuario')
		.then(response => {
			if (!response.ok) {
				throw new Error('❌ No se pudo cargar la lista de usuarios.');
			}
			return response.json();
		})
		.then(data => {
			loadingDiv.style.display = 'none';

			data.forEach(usuario => {
				const row = document.createElement('tr');
				row.innerHTML = `
          <td>${usuario.id}</td>
          <td>${usuario.nombre}</td>
          <td>${usuario.apellido || '-'}</td>
          <td>${usuario.telefono || '-'}</td>
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

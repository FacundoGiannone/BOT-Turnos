console.log("horario_table.js cargado");

setTimeout(() => {
  const loading = document.getElementById("loading");
  const error = document.getElementById("error");
  const tablaDiv = document.getElementById("tablaHorario");

  const dias = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes'];
  const horas = ['09:00', '10:00', '11:00', '12:00',
                 '13:00', '14:00', '15:00', '16:00', '17:00'];

  fetch('http://localhost:8080/turno') // Ajustá si usás otro endpoint
    .then(res => {
      if (!res.ok) throw new Error("Error al cargar los turnos");
      return res.json();
    })
    .then(data => {
      loading.style.display = 'none';

      // Crear tabla
      const table = document.createElement("table");
      table.classList.add("horario-table");

      // Crear cabecera
      const thead = document.createElement("thead");
      const headerRow = document.createElement("tr");
      headerRow.innerHTML = "<th>Hora / Día</th>" + dias.map(d => `<th>${d}</th>`).join('');
      thead.appendChild(headerRow);
      table.appendChild(thead);

      // Mapear turnos por día y hora
      const turnosMap = {}; // ej: turnosMap["Martes-09:00"] = { profesional, usuario }

      data.forEach(t => {
        const fecha = new Date(t.fecha);
        const diaSemana = fecha.toLocaleDateString('es-ES', { weekday: 'long' });
        const capitalizado = diaSemana.charAt(0).toUpperCase() + diaSemana.slice(1);
        const clave = `${capitalizado}-${t.hora.slice(0, 5)}`;
        turnosMap[clave] = t;
      });

      // Crear cuerpo
      const tbody = document.createElement("tbody");

      horas.forEach(hora => {
        const row = document.createElement("tr");
        row.innerHTML = `<td>${hora}</td>`;

        dias.forEach(dia => {
          const clave = `${dia}-${hora}`;
          const turno = turnosMap[clave];

          const td = document.createElement("td");

          if (turno) {
            td.classList.add("turno-ocupado");
            td.innerText = `${turno.id && clave || ''}\n${turno.profesional.apellido+" "+turno.profesional.nombre|| ''}`;
          } else {
            td.innerText = "+";
          }

          row.appendChild(td);
        });

        tbody.appendChild(row);
      });

      table.appendChild(tbody);
      tablaDiv.appendChild(table);
    })
    .catch(err => {
      loading.style.display = 'none';
      error.innerText = err.message;
      console.error(err);
    });

}, 100);

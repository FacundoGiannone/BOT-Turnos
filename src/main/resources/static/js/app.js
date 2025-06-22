function showView(view) {
  const content = document.getElementById("content");

  console.log(`➡️ Cargando vista: ${view}.html`);

  fetch(`${view}.html`)
    .then(response => {
      if (!response.ok) throw new Error("Vista no encontrada");
      return response.text();
    })
    .then(html => {
      content.innerHTML = html;

      setTimeout(() => {
        const script = document.createElement('script');
        script.src = `/js/${view}.js`;
        script.onload = () => console.log(`✅ Script ${script.src} cargado.`);
        script.onerror = () => console.error(`❌ Error cargando ${script.src}`);
        document.body.appendChild(script);
      }, 50);
    })
    .catch(error => {
      console.error("❌ Error al cargar la vista:", error);
      content.innerHTML = `<p>Error al cargar la vista: ${view}</p>`;
    });
}

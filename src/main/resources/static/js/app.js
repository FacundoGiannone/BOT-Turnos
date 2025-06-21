function showView(view) {
  const content = document.getElementById("content");
  fetch(`${view}.html`)
    .then(response => response.text())
    .then(html => content.innerHTML = html)
    .catch(() => content.innerHTML = `<p>Error al cargar la vista: ${view}</p>`);
}

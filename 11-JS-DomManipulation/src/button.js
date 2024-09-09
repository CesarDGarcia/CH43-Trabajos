// Acceder a los elementos que voy a manipular (el boton y el div conationer)
const button = document.getElementById("button--card");
const container = document.getElementById ("card--container");

container.style.visibility = "visible";

button.addEventListener("click", () => {
    container.style.visibility = (container.style.visibility === "visible") ? "hidden" : "visible";
});
const boton = document.querySelector(".btn")
boton.addEventListener("click", () => {
    alert("click en el botón")
})


$(() => {

    $(".btn-JQ").click(() => {
        console.log("Hola, estoy utilizando jQuery")
    })
})
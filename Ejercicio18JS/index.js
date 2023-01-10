const parrafos = document.querySelectorAll(".parrafo")
const secciones = document.querySelectorAll(".seccion")
const papelera = document.querySelectorAll(".papelera")
parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        event.dataTransfer.setData("id", parrafo.id)
        parrafo.classList.add("dragging")
        const elm_fantasma = document.querySelector(".img-fantasma")
        event.dataTransfer.setDragImage(elm_fantasma, 0, 0)
        //sconsole.log("Arrastrando el parrafo: " + parrafo.innerText)
    })
    parrafo.addEventListener("dragend", () => {
        parrafo.classList.remove("dragging")
        //console.log("Soltando el parrafo: " + parrafo.innerText)
    })
})
secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEffect = "move" //"copy", "link", "none"
        //console.log("Drag over")
    })
    seccion.addEventListener("drop", event => {
        const id_parrafo = event.dataTransfer.getData("id")
        const parrafo = document.getElementById(id_parrafo)
        seccion.appendChild(parrafo)
        //console.log(parrafo)
        //console.log(parrafo)
        //console.log("Drop")
    })
})
papelera.forEach(paper => {
    paper.addEventListener("dragover", event => {
        event.preventDefault()
        event.dataTransfer.dropEffect = "move"
    })            
    paper.addEventListener("drop", event => {
        const id_dropparr = event.dataTransfer.getData("id")
        document.getElementById(id_dropparr).remove()
        //console.log(`Eliminando ${id_dropparr}`)
    })
})
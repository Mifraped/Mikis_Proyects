const nombre = "Miguel"
const apellido = "Franco"
const objeto = {nombre, apellido}

//sessionStorage.setItem("objeto", JSON.stringify(objeto))
//console.log(JSON.parse(sessionStorage.getItem("objeto")))
//localStorage.setItem("objeto", JSON.stringify(objeto))

const now = new Date()
//document.cookie = `objeto=${JSON.stringify(objeto)}; expires=${new Date(now.getTime()+120000)}`


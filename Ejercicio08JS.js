const fechaHoy = new Date()

const fechaNac = new Date(1984, 8, 7)

const henacido = fechaHoy.getTime() > fechaNac.getTime()

const diaNac = fechaNac.getDate()

const mesNac = fechaNac.getMonth()

const anyoNac = fechaNac.getFullYear()

console.log(anyoNac)
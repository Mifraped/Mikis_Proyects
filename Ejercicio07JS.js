const Miki = {nombre: "Miguel", apellido: "Franco", edad: 38, altura: 1.75 , esDesarrollador: false}

const edadMiki = Miki.edad

const listPersons = new Array(Miki)

listPersons.push({nombre: "Edu", apellido: "Gomez", edad: 38, altura: 1.74 , esDesarrollador: false},{nombre: "Diego", apellido: "Pontones", edad: 38, altura: 1.76 , esDesarrollador: false})

sortList = listPersons.sort((a, b) => a.altura - b.altura)

console.log(sortList)
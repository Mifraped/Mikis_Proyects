let compra = ["Pepinos", "Tomates", "Calabacin", "Melocotones", "Berenjenas"]

compra.push("Aceite de girasol")
compra.pop()

let peliculas = [
    {Titulo: "La vida de brian", Director: "Terry Jones", Año: 1979},
    {Titulo: "Maximo Riesgo", Director: "Renny Harlin", Año:1993},
    {Titulo: "Ex Machina", Director: "Alex Garland", Año: 2014}
]

let listModern = peliculas.filter(peli => peli.Año >= 2010)

let listDirec = peliculas.map(peli => peli.Director)

let listTit = peliculas.map(peli => peli.Titulo)

let listaConcat = listDirec.concat(listTit)

let listaPropagacion = [...listDirec,...listTit]


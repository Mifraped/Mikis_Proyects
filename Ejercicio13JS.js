class Estudiante{
    nombre = "Miguel"
    asignaturas = ["JavaScript", "HTML", "CSS"]
    obtenDatos(){
        return{
            nombre: this.nombre,
            asignaturas: this.asignaturas
        }
    }
}
const Estudiante1 = new Estudiante()
console.log(Estudiante1.obtenDatos())

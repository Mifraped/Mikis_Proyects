class alumno():
    def __init__(self,nomre,nota):
        self.nombre = nomre
        self.nota = nota
    def __str__(self):
        return "Nombre: {}, Nota: {},".format(self.nombre, self.nota)
    def haAprobado(self):
        if self.nota >= 5:
            print("El alumno {} obtuvo una puntuacion de {}. Es un maquina y ha aprobado".format(self.nombre, self.nota))
        else:
            print("El alumno "+self.nombre+" obtuvo una puntuacion de "+str(self.nota)+". Es un tolai y esta suspenso")

A = alumno("Pepito",4.5)
B = alumno("Paquita",8.5)
C = alumno("Manolito",5.5)
print(A)
print(B)
print(C)
A.haAprobado()
B.haAprobado()
C.haAprobado()

import pickle

class vehiculo:
    def __init__(self,tipo,modelo,color):
        self.tipo = tipo
        self.modelo = modelo
        self.color = color
    def __str__(self):
        return f'Tipo: {self.tipo}\nModelo: {self.modelo}\nColor: {self.color}\n'
    def arrancar(self):
        print("BRUM BRUUMMMM")

vehiculo64 = vehiculo("coche","kadett","blanco")
f = open('vehiculo.bin', 'wb')
pickle.dump(vehiculo64,f)
f.close()

f = open('vehiculo.bin', 'rb')
vehiculo6 = pickle.load(f)
f.close()

print(vehiculo6)
vehiculo6.arrancar()

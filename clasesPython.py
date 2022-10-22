class vehiculo:
    color = ""
    ruedas = None
    puertas = None
class coche(vehiculo):
    velocidad = 0
    cilindrada = 0
    def acelerar(self, cantidad):
        self.velocidad += cantidad
    def __init__(self,color,ruedas,puertas,cilindrada):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        self.cilindrada = cilindrada

kadett = coche("Blanco",4,5,1.9)
print(kadett.color)
print(kadett.ruedas)
print(kadett.puertas)
print(kadett.cilindrada)

print(kadett.velocidad)
kadett.acelerar(50)
print(kadett.velocidad)

año = input("introduce un año")
def esBisiesto(numero):
    return not int(numero) % 4 and(int(numero) % 100 or not int(numero) % 400)

print("El año " + año + " es bisiesto" if esBisiesto(año) == True else "El año " + año + " no es bisiesto")



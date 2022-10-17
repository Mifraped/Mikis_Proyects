peso = input ("Cual es tu peso en Kgs?")
altura = input ("Cual es tu altura en metros?")
imc = round (float (peso) / float (altura) **2, 2)
print ("Tu indice de masa corporal es:" + str(imc) + " Estas gordo")
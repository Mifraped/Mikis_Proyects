strPaises = input("Introduzca una lista de paises (separada por comas)\n")
listaPaises = strPaises.split(",")
print(sorted(list(set(listaPaises))))


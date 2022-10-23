f = open('fichero.txt', 'w')
f.write("Hola, he creado un archivo\n")
f.close()
f = open('fichero.txt', 'r+')
f.readline()
f.write("Segunda vez que escribo\n")
f.close()




import sqlite3

conn = sqlite3.connect('newDatabase.db')
cursor = conn.cursor()
rows = cursor.execute(
    'CREATE TABLE Alumnos( id INTEGER PRIMARY KEY, nombre TEXT NOT NULL, apellido TEXT NOT NULL)')
rows = cursor.execute('INSERT INTO Alumnos VALUES(1, "Miki", "Lauda")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(2, "Santiago", "Lopez")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(3, "Tino", "Calderas")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(4, "Tomas", "Drogas")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(5, "Javier", "Billetera")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(6, "David", "Tolerdo")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(7, "Ruben", "Morena")')
rows = cursor.execute('INSERT INTO Alumnos VALUES(8, "Manuel", "Rebollo")')

rows = cursor.execute('SELECT * FROM Alumnos WHERE nombre="Tino"')
for row in rows:
    print(row)
conn.commit()
cursor.close()
conn.close()








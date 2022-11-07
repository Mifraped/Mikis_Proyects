from django.db import models

class Genere(models.Model):
    nombre = models.CharField(max_length=64, help_text="Nombre del genero")

    def __str__(self):
        return self.nombre

class Director(models.Model):
    nombre = models.CharField(max_length=64, help_text="Nombre del director")
    nacionalidad = models.CharField(max_length=64, help_text="Nacionalidad del director")
    periodo_actividad_desde = models.DateField(null=True, blank=True, help_text="Periodo de actividad del director")
    periodo_actividad_hasta = models.DateField(null=True, blank=True, help_text="Periodo de actividad del director")

    def __str__(self):
        return self.nombre

class Film(models.Model):
    titulo = models.CharField(max_length=64, help_text="Titulo de la pelicula")
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    sinopsis = models.TextField(help_text="Resumen de la pelicula")
    isbn = models.CharField('ISBN', max_length=13, help_text="ISBN de 13 caracteres")
    genero = models.ManyToManyField(Genere)

    def __str__(self):
        return self.titulo





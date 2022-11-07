# Generated by Django 4.1.3 on 2022-11-03 17:56

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Director',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(help_text='Nombre del director', max_length=64)),
                ('nacionalidad', models.CharField(help_text='Nacionalidad del director', max_length=64)),
                ('periodo_actividad', models.DateField(blank=True, help_text='Periodo de actividad del director', null=True)),
            ],
        ),
        migrations.CreateModel(
            name='Genero',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(help_text='Nombre del genero', max_length=64)),
            ],
        ),
        migrations.CreateModel(
            name='Pelicula',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('titulo', models.CharField(help_text='Titulo de la pelicula', max_length=64)),
                ('sinopsis', models.TextField(help_text='Resumen de la pelicula', max_length=200)),
                ('isbn', models.CharField(help_text='ISBN de 13 caracteres', max_length=13, verbose_name='ISBN')),
                ('director', models.ForeignKey(null=True, on_delete=django.db.models.deletion.SET_NULL, to='catalogo.director')),
                ('genero', models.ManyToManyField(to='catalogo.genero')),
            ],
        ),
    ]

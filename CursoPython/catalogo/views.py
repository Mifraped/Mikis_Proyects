from django.shortcuts import render
from .models import *

def index(request):
    num_generes = Genere.objects.all().count()
    num_directors = Director.objects.all().count()
    num_films = Film.objects.all().count()

    return render(
        request,
        "index.html",
        context={
            'num_generes': num_generes,
            'num_directors': num_directors,
            'num_films': num_films
        }
    )


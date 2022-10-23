import time
def main():
    diaHora = time.gmtime(time.time())
    print(diaHora)
    if diaHora.tm_hour >= 19:
        print("Son mas de las 19:00, vete a casa Estiff")
    else:
        hhRest = 18 - diaHora.tm_hour
        minrest = 59 - diaHora.tm_min
        secrest = 60 - diaHora.tm_sec
        print("Te quedan {} horas, {} minutos y {} segundos de trabajo, peinate".format(hhRest,minrest,secrest))

if __name__ == '__main__':
    main()
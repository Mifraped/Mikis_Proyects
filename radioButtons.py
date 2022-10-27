import tkinter
from tkinter import ttk

window = tkinter.Tk()

window.columnconfigure(0,weight=4)
window.columnconfigure(1,weight=4)

seleccionado = tkinter.StringVar()
def miFuncion():
    print("Opcion {}".format(seleccionado.get()))

def funcRes():
    seleccionado.set("0")

r1 = ttk.Radiobutton(window, text="Opcion 1", value=1, variable=seleccionado, command=miFuncion)
r2 = ttk.Radiobutton(window, text="Opcion 2", value=2, variable=seleccionado, command=miFuncion)
r3 = ttk.Radiobutton(window, text="Opcion 3", value=3, variable=seleccionado, command=miFuncion)
r4 = ttk.Radiobutton(window, text="Reset", value=4, variable=seleccionado, command=funcRes)

r1.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)
r2.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)
r3.grid(column=0, row=2, sticky=tkinter.W, padx=5, pady=5)
r4.grid(column=0, row=3, sticky=tkinter.W, padx=5, pady=5)

window.mainloop()
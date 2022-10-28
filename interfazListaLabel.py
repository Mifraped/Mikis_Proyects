import tkinter
from tkinter import ttk

window = tkinter.Tk()
window.columnconfigure(0,weight=5)

etiquetaChoose = ttk.Label(window, text="Elige una opcion:")
etiquetaChoose.grid(column=0, row=0, sticky=tkinter.W, padx=10, pady=10)

lista = ['Caca', 'Culo', 'Pedo', 'Pis']
listaStr = tkinter.StringVar(value=lista)
listatk = tkinter.Listbox(window, height=4, listvariable=listaStr)
listatk.grid(column=0, row=1, sticky=tkinter.W, padx=10, pady=10)


window.mainloop()
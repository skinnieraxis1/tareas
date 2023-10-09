##Function place##

def leerDatosDeUnAlumno():
    notasAlumno=[]
    alumno = str(input("Ingrese el nombre del alumno: "))
    notasAlumno.append(alumno)
    for x in range(4):
        notaBimestre=int(input(f"Ingrese la nota del alumno {alumno} en el bimestre {x+1}: "))
        notasAlumno.append(notaBimestre)
        print(notasAlumno)
    return(notasAlumno)

def cargarTodos(alumnos,cant):
    for x in range(cant):
        datos = leerDatosDeUnAlumno()
        alumnos.append(datos)

def listaCursos(alumnos):
    for datos in alumnos:
        for datitos in datos:
            print(f"{datitos},", end=" ")
        print("\n")
    
def menu(alumnos, datos, end):
    print("¿Deseas empezar un curso nuevo o agregar un alumno?")
    print("1. Empezar un curso nuevo")
    print("2. Agregar un alumno")
    print("3. Mostrar curso")
    print("4. Finalizar")
    print("")
    select=int(input(""))
    print("")

    if select == 1 and alumnos != [""]:
        cant = int(input("Ingrese la cant de alumnos que hay en el curso: "))
        cargarTodos(alumnos, cant)
    elif select == 2:
        datos = leerDatosDeUnAlumno()
        alumnos.append(datos)
    elif select == 3 and alumnos != [""]:
        listaCursos(alumnos)
    elif select == 4:
        end = 0
    else:
        print("error por favor vuelva a seleccionar")

##Function call place##

alumnos = []
datos   = []
end = 1

while (end == 1):
    menu(alumnos, datos, end)


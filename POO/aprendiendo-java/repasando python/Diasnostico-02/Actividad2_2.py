
def sumaNotas(cantAlumnos):
    listaNotas = []
    for x in range(cantAlumnos):
        nota = int(input(f"Ingrese la nota del alumno {x+1}°: "))
        listaNotas.append(nota)
    return listaNotas

def promediar(lista):
    total = 0
    for nota in lista:
        total += nota
    return round(total/len(lista), 1)

def listMayorPromedio(listaNotas, promedio):
    listaNumeroAlumno = []
    listaNotasMayor = []
    for nota, pos in zip(listaNotas, range(len(listaNotas))):
        if nota >= promedio:
            listaNumeroAlumno.append(pos+1)
            listaNotasMayor.append(nota)
    return listaNotasMayor, listaNumeroAlumno

def listDesaprobados(listaNotas):
    listaNumeroAlumno = []
    listaNotasDesaprobadas = []
    for nota, pos in zip(listaNotas, range(len(listaNotas))):
        if nota < 6:
            listaNumeroAlumno.append(pos+1)
            listaNotasDesaprobadas.append(nota)
    return listaNotasDesaprobadas, listaNumeroAlumno

def imprimir(titulo, lista):
    print( titulo )
    if lista == []:
        print("0", end='')
    else:
        for x in lista:
            print (x, end=', ')
    print()

notas = sumaNotas(8)
promedio = promediar(notas)
listNotasMayor, listaNumeroAlumnoMayor = listMayorPromedio(notas, promedio)
listaNotasDesaprobadas, listaNumeroAlumnosDesaprobados = listDesaprobados(notas)

print("\nEl promedio del curso es:", promedio)
imprimir("Los alumnos que superaron el promedio son : ", listaNumeroAlumnoMayor)
imprimir("Las notas que superaron el promedio son : ", listNotasMayor)
imprimir("Los alumnos que desaprobaron son : ", listaNumeroAlumnosDesaprobados)
imprimir("Las notas que desaprobaron son : ", listaNotasDesaprobadas)


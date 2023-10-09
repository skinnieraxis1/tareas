
def ingresar():
    lista = []
    for i in range(5):
        nota = int(input(f'Ingresar nota del {i+1}° alumno: '))
        lista.append(nota)
    return lista

def promediar(lista):
    total = 0
    for nota in lista:
        total += nota
    return round(total/len(lista), 1)

def mayor_promedio(list1, list2):
    plist1 = promediar(list1)
    plist2 = promediar(list2)
    if plist1 > plist2: return f"Curso A tiene mejor promedio: {plist1}"
    elif plist2 > plist1: return f"Curso B tiene mejor promedio: {plist2}"
    else: return f"Curso A y B tienen mismo promedio: {plist1}"

notasA = ingresar()
notasB = ingresar()
print(mayor_promedio(notasA, notasB))


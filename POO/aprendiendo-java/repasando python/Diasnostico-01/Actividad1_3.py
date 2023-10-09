
def ingresar():
    lista = []
    for i in range(4):
        num = int(input(f'Ingresar numero {i+1}°: '))
        lista.append(num)
    return lista

def sum_lists(list1, list2):
    listaT = []
    for l1, l2 in zip(list1, list2):
        listaT.append(l1 + l2)
    return listaT

print("Lista 1")
lista1 = ingresar()
print("Lista 2")
lista2 = ingresar()
lista_total = sum_lists(lista1, lista2)
print('Primera lista:', lista1)
print('Segunda lista:', lista2)
print('Suma de componentes de las listas:', lista_total)


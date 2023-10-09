
def ingresar():
    lista = []
    for i in range(8):
        num = int(input(f'Ingrese numero {i+1}°: '))
        lista.append(num)
    return lista

def total(lista):
    t = 0
    for num in lista:
        t += num
    return t

def total36(lista):
    t = 0
    for num in lista:
        if num > 36:
            t += num
    return t

def cant50(lista):
    t = 0
    for num in lista:
        if num > 50:
            t += 1
    return t
    
nums = ingresar()
print('Valor acumulado de todos lo elementos de la lista:', total(nums))
print('Valor acumulado de valores mayores a 36:', total36(nums))
print('Cantidad de valores mayores a 50:', cant50(nums))


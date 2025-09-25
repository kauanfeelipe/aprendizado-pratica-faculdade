def bolha(lis):
    for p in range(1,len(lis)):
        print(f'\nPasso: {p}')

        for i in range(len(lis) - p):
            if lis[i] > lis[i + 1]:
                lis[i], lis[i + 1] = lis[i + 1], lis[i]
            print(lis)

print('\nBolha em ordem crescente - maior no final')
vet1 = [25,57,48,37,12,92,86,33]
print(vet1)
bolha(vet1)

#ex01 / alterar o algoritmo bubble sort para classificar um vetor em ordem decrescente
def bolha2(lis):
    for p in range(1,len(lis)):
        print(f'\nPasso: {p}')

        for i in range(len(lis) - p):
            if lis[i] < lis[i + 1]:
                lis[i], lis[i + 1] = lis[i + 1], lis[i]
            print(lis)


#ex02 / alterar o algoritmo para classificar um vetor em ordem crescente colocando os elementos menores no inicio do vetor
def menoresInicio(lista):
    for valor in range(1,len(lista)):
        print(f'\nPasso: {valor}')

        for i in range(len(lista) -1,valor -1, -1):
            if lista[i] < lista[i - 1]:
                lista[i], lista[i - 1] = lista[i - 1], lista[i]
            print(lista)

print('\nBolha em ordem crecente - menor no inicio')
print('\n')
vet2 = [25,57,48,37,12,92,86,33]
print(vet2)
menoresInicio(vet2)


#ex03 / alterar o algortitmo para ordenar um vetor em ordem crecente.O algortitmo deve ser otimizado
#para encecerrar a execução antecipadamente caso o vetor ja esteja ordenado antes do termino do processo
def bolhaOtimizado(lis):
    ordenado = False
    for p in range(1, len(lis)):
        if ordenado:
            return
        print(f'\nPasso: {p} - {ordenado}')
        ordenado = True
        for i in range(len(lis) - p):
            if lis[i] > lis[i + 1]:
                ordenado = False
                lis[i],lis[i + 1] = lis[i + 1], lis[i]
            print(lis)

print('\nBolha em ordem crescente otimizado')
print('\n')
vet3 = [23,45,78,12,2,40]
bolhaOtimizado(vet3)

#ex04 / alterar o algoritmo para ordenar um segmento do vetor em ordem crescente

def bolhaCrescenteSegmentado(lis,inicio,fim):
    for p in range(fim - inicio):
        for i in range(inicio, fim - p):
            if lis[i] > lis[i + 1]:
                lis[i],lis[i + 1] = lis[ i + 1], lis[i]
            print(lis)

print('\nBolha em ordem crescente segmento')
print('\n')
vet4 = [23,45,78,12,2,40]
bolhaCrescenteSegmentado(vet4)


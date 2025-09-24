#utilizando o metodo de ordenação por seleção,classificar apenas os x menores elementos da lista, colocando-os nas x primeiras posicoes
#O restante da lista nao precisa esta ordenado
#exemplo v = 15,8,23,3,12,43
#classificar os 3 menores , v = 3,8,12|23,43,15


def classificarxmenores(lis, x):
    # Obtém o tamanho da lista
    tamanho_lista = len(lis)
    # Se x for maior que o tamanho da lista, ajusta x para o tamanho da lista
    if x > tamanho_lista:
        x = tamanho_lista  # Ajusta x se for maior que o tamanho da lista

    # Percorre as primeiras x posições da lista
    for p in range(x):
        # Assume que o menor elemento está na posição atual
        indice_menor = p
        # Procura o menor elemento no restante da lista
        for i in range(p + 1, tamanho_lista):
            if lis[i] < lis[indice_menor]:
                indice_menor = i  # Atualiza o índice do menor elemento encontrado

        # Se encontrou um elemento menor, faz a troca
        if indice_menor != p:
            lis[p], lis[indice_menor] = lis[indice_menor], lis[p]

        # Mostra o estado da lista após cada passo
        print(f'Passo {p + 1}: {lis}')

    # Retorna a lista com os x menores elementos nas primeiras posições
    return lis

# Lista de exemplo
minha_lista_nova = [15, 8, 23, 3, 12, 1, 17]
print(f'lista original: {minha_lista_nova}')
lista_ordenada4 = classificarxmenores(minha_lista_nova, 3)
print(f'Lista ordenada: {lista_ordenada4}')
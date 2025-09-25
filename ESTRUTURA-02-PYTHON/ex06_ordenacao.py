# criar uma versão do algoritmo de ordenação por seleção para colocar os elementos maiores no final
def elementosMaioresNoFinal(lis):
    """
    A cada iteração o algoritmo encontra o maior elemento da porção não ordenada
    e o coloca no final dessa porção.
    """
    tamanho_lista = len(lis)

    # O laço externo percorre a lista de trás para frente para posicionar o maior elemento
    # em cada índice final.
    for p in range(tamanho_lista - 1, 0, -1):
        # Assume que o maior elemento está na posição atual 'p'
        indice_maior = p
        # O laço interno busca pelo verdadeiro maior elemento no restante da lista

        for i in range(p - 1, -1, -1):
            # Compara se o elemento atual 'i' é MAIOR que o maior já encontrado
            if lis[i] > lis[indice_maior]:
                indice_maior = i # Se for, atualiza o índice do maior.

        # Após encontrar o maior elemento, troca-o de lugar
        # com o elemento da posição 'p'.
        # Esta troca só acontece se um elemento maior foi realmente encontrado
        if indice_maior != p:
            lis[p], lis[indice_maior] = lis[indice_maior], lis[p]

        # Imprimir o estado da lista a cada passo principal.
        print(f'Passo {tamanho_lista - p}: {lis}')

    return lis

minha_lista = [25,57,48,37,12,92,86,33]
print(f'lista original: {minha_lista}')
lista_ordenada2 = elementosMaioresNoFinal(minha_lista)
print(f'Lista ordenada: {lista_ordenada2}')
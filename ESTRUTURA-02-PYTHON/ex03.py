def selecao_crescente(lis):
    """
    a cada iteração o algoritmo encontra o menor elemento da porção nao ordenada
    e o coloca no inicio dessa porção.
    """
    tamanho_lista = len(lis)

    #o laço externo percorre a lista para posicionar o elemento correto
    #em cada indice.
    for p in range(tamanho_lista - 1 ):
        #assume que o menor elemento esta na posicao atual 'p'
        indice_menor = p
        #o laço interno busca pelo verdadeiro menor elemento no restante da lista

        for i in range(p+1, tamanho_lista):
            #compara se o elemento atual 'i' é MENOR que o menor ja encontrado
            if lis[i] < lis[indice_menor]:
                indice_menor = i # se for , atualiza o indice do menor.

    #apos encontrar o menor elemento , troca-o de lugar
    #com o elemento da posicao 'p'.
    #esta troca so acontece se um elemento menor foi realmente encontrado
        if indice_menor != p:
            lis[p], lis[indice_menor] = lis[indice_menor], lis[p]
        
        #imprimir o estado da lista a cada passo principal.
        print(f"Passo {p+1}: {lis}")

    return lis

minha_lista = [25,57,48,37,12,92,86,33]
print(f'lista original: {minha_lista}')


lista_ordenada = selecao_crescente(minha_lista)

print(f'Lista ordenada: {lista_ordenada}')










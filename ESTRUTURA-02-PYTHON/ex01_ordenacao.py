#utilizando o metodo de ordenação por seleção,classificar os elementos de forma diferente com base em sua posição(indice)
#elementos em posicaoes pares sao ordenados em ordem crescente
#elementos em posicoes impares sao ordenados em ordem decrescente

def selecao_mista(lis):
    """
    Algoritmo de ordenação por seleção (selection sort) modificado:
    - Nas posições pares, coloca o menor elemento (ordem crescente).
    - Nas posições ímpares, coloca o maior elemento (ordem decrescente).
    """
    tamanho_lista = len(lis)

    # percorre cada posição da lista
    for p in range(tamanho_lista - 1):
        indice_extremo = p  # pode ser menor (pares) ou maior (ímpares)

        # laço interno para procurar o elemento adequado
        for i in range(p+1, tamanho_lista):
            if p % 2 == 0:  
                # posição par → procura o menor
                if lis[i] < lis[indice_extremo]:
                    indice_extremo = i
            else:  
                # posição ímpar → procura o maior
                if lis[i] > lis[indice_extremo]:
                    indice_extremo = i

        # troca somente se achou alguém melhor (menor ou maior)
        if indice_extremo != p:
            lis[p], lis[indice_extremo] = lis[indice_extremo], lis[p]

        # imprime o estado da lista após cada passo
        print(f"Passo {p+1}: {lis}")

    return lis


# exemplo de uso
minha_lista = [25, 57, 48, 37, 12, 92, 86, 33]
print(f"Lista original: {minha_lista}")
lista_ordenada = selecao_mista(minha_lista)
print(f"Lista ordenada mista: {lista_ordenada}")

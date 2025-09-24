#escrever uma versao do metodo de ordenação por seleção p/ retornar a quantidade de comparações
#e de trocas realizadas durante.

def selecao_contando(lis):
    """
    Ordenação por seleção (selection sort) que retorna:
    - quantidade de comparações
    - quantidade de trocas realizadas
    """
    tamanho_lista = len(lis)
    comparacoes = 0
    trocas = 0

    for p in range(tamanho_lista - 1):
        indice_menor = p

        # percorre o resto da lista
        for i in range(p+1, tamanho_lista):
            comparacoes += 1  # toda vez que comparamos, soma 1
            if lis[i] < lis[indice_menor]:
                indice_menor = i

        # se encontrou um menor, faz a troca
        if indice_menor != p:
            lis[p], lis[indice_menor] = lis[indice_menor], lis[p]
            trocas += 1

    return lis, comparacoes, trocas


# exemplo de uso
minha_lista = [25, 57, 48, 37, 12, 92, 86, 33]
print(f"Lista original: {minha_lista}")
lista_ordenada, comps, trocas = selecao_contando(minha_lista)
print(f"Lista ordenada: {lista_ordenada}")
print(f"Comparações realizadas: {comps}")
print(f"Trocas realizadas: {trocas}")

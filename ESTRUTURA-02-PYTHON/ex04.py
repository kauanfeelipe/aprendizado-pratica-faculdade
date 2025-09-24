def selecao_otimizada(lis):
    """
    Selection sort otimizado:
    - Para antecipadamente se nenhuma troca ocorrer em uma iteração.
    """
    tamanho_lista = len(lis)

    for p in range(tamanho_lista - 1):
        indice_menor = p

        for i in range(p+1, tamanho_lista):
            if lis[i] < lis[indice_menor]:
                indice_menor = i

        # se encontrou um menor, troca
        if indice_menor != p:
            lis[p], lis[indice_menor] = lis[indice_menor], lis[p]
            print(f"Passo {p+1}: {lis}")
        else:
            # Verifica se o restante da lista está ordenado (sem usar all)
            ordenado = True
            for j in range(p, tamanho_lista - 1):
                if lis[j] > lis[j+1]:
                    ordenado = False
                    break
            if ordenado:
                print("Nenhuma troca realizada. Lista já está ordenada!")
                break
            else:
                print(f"Passo {p+1}: {lis} (sem troca)")

    return lis

# exemplo de uso
print("Exemplo 1 (já ordenada):")
print(selecao_otimizada([12, 25, 33, 37, 48, 57, 86, 92]))

print("\nExemplo 2 (desordenada):")
print(selecao_otimizada([25, 57, 48, 37, 12, 92, 86, 33]))

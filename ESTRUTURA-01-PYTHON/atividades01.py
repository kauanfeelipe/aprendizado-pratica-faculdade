def push(p,v):
    p.append(v)

def pop(p):
    return p.pop()

def vazia(p):
    return False if p else True

def calcular_e_analisar(p):
    aux = []
    soma = 0
    while not vazia(p):    
        v = pop(p)
        push(aux, v)
        soma += v
    
    media = soma / len(aux)
    menores = 0
    maiores = 0
    iguais = 0
    
    while not vazia(aux):
        v = pop(aux)
        if v < media:
            menores += 1
        elif v > media:
            maiores += 1
        else:
            iguais += 1
    
    print(f"Média: {media}")
    print(f"Menores que a média: {menores}")
    print(f"Maiores que a média: {maiores}")
    print(f"Iguais à média: {iguais}")
    return media

def concatenarElementosPares(p1, p2, p3):
    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2)
        if v1 % 2 == 0:
            push(p3, v1)
        if v2 % 2 == 0:
            push(p3, v2)
    while not vazia(p1):
        v1 = pop(p1)
        if v1 % 2 == 0:
            push(p3, v1)
    while not vazia(p2):
        v2 = pop(p2)
        if v2 % 2 == 0:
            push(p3, v2)

    return p3

p1 = []
p2 = []
p3 = []

push(p1, 1)
push(p1, 2)
push(p1, 3)
push(p1, 4)

push(p2, 5)
push(p2, 6)
push(p2, 7)
push(p2, 8)

print(concatenarElementosPares(p1, p2, p3))
calcular_e_analisar([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])


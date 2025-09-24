def push(p, v):
    p.append(v)


def pop(p):
    return p.pop()


def vazia(p):
    return False if p else True

def mostrar_pilha(p):
    # criar a pilha aux vazia
    aux = []  # aux foi criada como vazia
    while not vazia(p):  # enquanto a pilha p não estiver vazia
        v = pop(p)  # retirar o elemento do topo da pilha p
        push(aux, v)  # colocar o elemento na pilha auxiliar
    while not vazia(aux):
        v = pop(aux)
        print(v)
        push(p, v)


def exercicio01(p):
    qe = 0
    soma = 0
    media = 0
    qtdMenor=0
    qtdIgual=0
    qtdMaior=0
    aux = []
    while not vazia(p):
        v = pop(p)
        push(aux, v)
    while not vazia(aux):
        v = pop(aux)
        qe += 1
        soma += v
        push(p, v)

    media = soma/qe
    while not vazia(p):
        v = pop(p)
        push(aux, v)
    while not vazia(aux):
        v = pop(aux)
        if v < media:
            qtdMenor+=1
        elif v == media:
            qtdIgual+=1
        else:
            qtdMaior+=1
        push(p, v)

    print(f'Media dos elementos da pilha: {media}')
    print(f'Quantidade de elementos menor que a media: {qtdMenor}')
    print(f'Quantidade de elementos iguais a media: {qtdIgual}')
    print(f'Quantidade de elementos maior que a media: {qtdMaior}')

def exercicio02 (p1,p2,p3):
    aux1=[]
    aux2=[]
    while not vazia(p1):
        valor = pop(p1)
        push(aux1,valor)
    while not vazia(p2):
        valor = pop(p2)
        push(aux2,valor)

    while not vazia(aux1):
        valor = pop (aux1)
        if valor % 2 == 0:
           push(p3,valor)
        push(p1, valor)

    while not vazia(aux2):
        valor = pop (aux2)
        if valor % 2 == 0:
           push(p3,valor)
        push(p2, valor)



p=[]
p2=[]
p3=[]
push(p,10)
push(p,15)
push(p,5)
push(p,17)
push(p,3)
exercicio01(p)
push(p2,23)
push(p2,2)
push(p2,51)
push(p2,18)
push(p2,35)
exercicio02(p,p2,p3)
mostrar_pilha(p3)



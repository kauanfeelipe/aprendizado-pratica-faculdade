def push(p,v):
    p.append(v)


def pop(p):
    return p.pop()
7

def vazia(p):
    return False if p else True


def mostrarTopo(p):
    if vazia(p):
        print("Pilha vazia")

    else:
        v = pop(p)
        push(p,v)
        print(v)


def esvaziarPilha(p):
    while not vazia(p):
        pop(p)


def mostrarPilha(p):
    aux = []
    while not vazia(p):
        v = pop(p)
        push(aux,v)
        print(v)

    while not vazia(aux):
        v = pop(aux)
        push(aux, v)


def tamanhoPilha(p):
    aux = []
    cont = 0
    while not vazia(p):
        v = pop(p)
        cont += 1
        push(aux,v)
    while not vazia(aux):
        v = pop(aux)
        push(p,v)
    return cont


def copiarPilha(p1,p2):
    aux = []
    while not vazia(p1):
        v = pop(p1)
        push(aux, v)
    while not vazia(aux):
        v = pop(aux)
        push(p1, v)
        push(p2, v)


def verificarTamanhoIgual(p1,p2):
    if tamanhoPilha(p1) == tamanhoPilha(p2):
        print("as duas pilhas tem o msm tamanho.")
        return True
    else:
        print("tamanho diferente")
        return False


def verificarTamanhoCompleto(p1,p2):
    aux1 = []
    aux2 = []
    retorno = True
    
    if tamanhoPilha(p1) != tamanhoPilha(p2):
        return False
    
    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2) 
        push(aux1,v1)
        push(aux2,v2)
        if v1 != v2:
            retorno =  False
            break


    while not vazia(aux1):
        push(p1, pop(aux1))
        
    while not vazia(aux2):
        push(p2, pop(aux2))
        
    # return retorno   
    return "as duas pilhas sao iguais" if retorno else "as duas pilhas nao sao iguais"
                    
def concatenarDuasPilhas(p1,p2,p3):
    aux1 = []
    aux2 = []


    while not vazia(p1):
        v1 = pop(p1)
        push(aux1,v1)

    while not vazia(p2):
        v2 = pop(p2)
        push(aux2,v2)

    while not vazia(aux1):
        v1 = pop(aux1)
        push(p1,v1)
        push(p3,v1)

    while not vazia(aux2):
        v2 = pop(aux2)
        push(p2,v2)
        push(p3,v2)
               
    return p3



def intercalarDuasPilhas(p1,p2,p3):
    aux1 = []
    aux2 = []
    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2)
        push(aux1,v1)
        push(aux2,v2)
        push(p3,v1)
        push(p3,v2)
        
    while not vazia(aux1):
        v1 = pop(aux1)
        push(p1,v1)
        
    while not vazia(aux2):
        v2 = pop(aux2)
        push(p2,v2)
        
    return p3 , p1 , p2


def calcPosfixa(epos):
    pilha = []
    for crt in epos:
        if crt.isdigit():
            push(pilha,float(crt))
        else:
            v2 = pop(pilha)
            v1 = pop(pilha)
            if crt == "+":
                r = v1 + v2
            elif crt == "-":
                r = v1 - v2
            elif crt == "*":
                r = v1 * v2
            else:
                r = v1 / v2
            push(pilha,r)

    return pop(pilha)


def intercalarPilhasordemCrescente(p1,p2,p3):
    aux1 = []
    aux2 = []
    
    while not vazia(p1):
        valor = pop(p1)
        push(aux1,valor)

    while not vazia(p2):    
        valor = pop(p2)
        push(aux2,valor)

    while not vazia(aux1) and not vazia(aux2):
        valor1 = pop(aux1)
        valor2 = pop(aux2)
        if valor1 < valor2:
            push(p3,valor1)
            push(aux2,valor2)
            push(p1,valor1)
        else:
            push(p3,valor2)
            push(aux1,valor1)
            push(p2,valor2)

    while not vazia(aux1):
        valor = pop(aux1)
        push(p1,valor)
        push(p3,valor)

    while not vazia(aux2):    
        valor = pop(aux2)
        push(p2,valor)
        push(p3,valor)

    return p3

#mostrar o diferença entre o ultimo e o penultimo




p = []
p1 =[]
p2 = []
p3 = []
# push(p,10)
push(p1,10)
push(p1,10)
push(p1,20)
push(p2,30)
push(p2, 40)


# print(f"tamanho da pilha Padrao:", tamanhoPilha(p))

# verificarTamanhoIgual(p1,p2)

# print(verificarTamanhoCompleto(p1,p2))
# print(concatenarDuasPilhas(p1,p2,p3))
# print(intercalarDuasPilhas(p1,p2,p3))
print('\nValor: ', calcPosfixa('328*+'))
print(intercalarPilhasordemCrescente(p1,p2,p3))

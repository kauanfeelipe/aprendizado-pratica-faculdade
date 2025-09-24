def push(p,v):
    p.append(v)

def pop(p):
    return p.pop()

def vazia(p):
    return False if p else True

def mostrarTopo(p):
    if vazia(p):
        print("Pilha ta vazia.")
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
    while not vazia(p):
        v = pop(aux)
        push(p,v)

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


def verificarTamanhoCompleto(p1,p2,p3):
    aux1 = []
    aux2 = []
    retorno = True

    if tamanhoPilha(p1) != tamanhoPilha(p2):
        return False

    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2)
        push(aux1 , v1)
        push(aux2 , v2)
        if v1 != v2:
            retorno = False

             
    while not vazia(aux1):
        push(p1 , pop(aux1))

    while not vazia(aux2):
        push(p2 , pop(aux2))


    return "as duas pilhas tao identicas" if retorno else "são diferentes"


p = []
p1 = []
p2 = []
p3 = []


push(p1 , 10)
push(p1 , 20)
push(p2 , 30)
push(p2 , 40)


print(verificarTamanhoCompleto(p1,p2,p3))

             
        
    



        
        


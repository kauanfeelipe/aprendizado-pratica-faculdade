# -------------------------
# Arquivo de estudo - Pilhas
# -------------------------

# -------------------------
# MINI-RESUMO
# -------------------------
# Este arquivo contém todas as operações básicas e avançadas com pilhas:
#
# - push(p, v): Insere um elemento na pilha.
# - pop(p): Remove e retorna o elemento do topo da pilha.
# - vazia(p): Verifica se a pilha está vazia.
# - mostrarTopo(p): Mostra o topo da pilha sem removê-lo.
# - esvaziarPilha(p): Remove todos os elementos da pilha.
# - mostrarPilha(p): Mostra todos os elementos da pilha sem alterar.
# - tamanhoPilha(p): Retorna o tamanho da pilha.
# - copiarPilha(p1, p2): Copia todos os elementos de p1 para p2.
# - verificarTamanhoIgual(p1, p2): Verifica se as pilhas têm o mesmo tamanho.
# - verificarTamanhoCompleto(p1, p2): Verifica se as pilhas são idênticas.
# - concatenarDuasPilhas(p1, p2, p3): Junta duas pilhas na terceira pilha.
# - intercalarDuasPilhas(p1, p2, p3): Intercala os elementos de duas pilhas na terceira.
# - intercalarPilhasordemCrescente(p1, p2, p3): Intercala em ordem crescente.
# - calcPosfixa(epos): Calcula expressão pós-fixa.
# - diferencaElementos(p): Mostra a diferença entre penúltimo, primeiro e último elemento.
# - diferencaPilha(a, b): Retorna os elementos de A que não existem em B.
#
# Todas as operações usam listas Python simulando o comportamento de pilhas.

# -------------------------
# Funcoes basicas de manipulacao de pilha
# -------------------------


def push(p, v):
    """Insere um elemento no topo da pilha"""
    p.append(v)


def pop(p):
    """Remove e retorna o elemento do topo da pilha"""
    return p.pop()


def vazia(p):
    """Verifica se a pilha esta vazia"""
    return False if p else True


def mostrarTopo(p):
    """Mostra o topo da pilha sem remover"""
    if vazia(p):
        print("Pilha vazia")
    else:
        v = pop(p)
        push(p, v)
        print(v)


def esvaziarPilha(p):
    """Remove todos os elementos da pilha"""
    while not vazia(p):
        pop(p)


def mostrarPilha(p):
    """Mostra todos os elementos da pilha sem alterar"""
    aux = []
    while not vazia(p):
        v = pop(p)
        push(aux, v)
        print(v)

    while not vazia(aux):
        v = pop(aux)
        push(p, v)


def tamanhoPilha(p):
    """Retorna o tamanho da pilha"""
    aux = []
    cont = 0
    while not vazia(p):
        v = pop(p)
        cont += 1
        push(aux, v)

    while not vazia(aux):
        v = pop(aux)
        push(p, v)

    return cont


def copiarPilha(p1, p2):
    """Copia todos os elementos de p1 para p2"""
    aux = []
    while not vazia(p1):
        v = pop(p1)
        push(aux, v)

    while not vazia(aux):
        v = pop(aux)
        push(p1, v)
        push(p2, v)


def verificarTamanhoIgual(p1, p2):
    """Verifica se as pilhas possuem o mesmo tamanho"""
    if tamanhoPilha(p1) == tamanhoPilha(p2):
        print("As duas pilhas tem o mesmo tamanho.")
        return True
    else:
        print("Tamanho diferente")
        return False


def verificarTamanhoCompleto(p1, p2):
    """Verifica se as pilhas sao identicas (tamanho e elementos)"""
    aux1 = []
    aux2 = []
    retorno = True

    if tamanhoPilha(p1) != tamanhoPilha(p2):
        return False

    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2)
        push(aux1, v1)
        push(aux2, v2)
        if v1 != v2:
            retorno = False
            break

    while not vazia(aux1):
        push(p1, pop(aux1))

    while not vazia(aux2):
        push(p2, pop(aux2))

    return "As duas pilhas sao iguais" if retorno else "As duas pilhas nao sao iguais"


def concatenarDuasPilhas(p1, p2, p3):
    """Concatena duas pilhas na pilha p3"""
    aux1 = []
    aux2 = []

    while not vazia(p1):
        v1 = pop(p1)
        push(aux1, v1)

    while not vazia(p2):
        v2 = pop(p2)
        push(aux2, v2)

    while not vazia(aux1):
        v1 = pop(aux1)
        push(p1, v1)
        push(p3, v1)

    while not vazia(aux2):
        v2 = pop(aux2)
        push(p2, v2)
        push(p3, v2)

    return p3


def intercalarDuasPilhas(p1, p2, p3):
    """Intercala elementos das pilhas p1 e p2 na pilha p3"""
    aux1 = []
    aux2 = []

    while not vazia(p1) and not vazia(p2):
        v1 = pop(p1)
        v2 = pop(p2)
        push(aux1, v1)
        push(aux2, v2)
        push(p3, v1)
        push(p3, v2)

    while not vazia(aux1):
        push(p1, pop(aux1))

    while not vazia(aux2):
        push(p2, pop(aux2))

    return p3


def calcPosfixa(epos):
    """Calcula uma expressao pos-fixa"""
    pilha = []
    for crt in epos:
        if crt.isdigit():
            push(pilha, float(crt))
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
            push(pilha, r)

    return pop(pilha)

def posfixa_para_infixa(epos):
    """Converte uma expressão pós-fixa para infixa"""
    pilha = []
    for crt in epos:
        if str(crt).isdigit():
            push(pilha, str(crt))
        else:
            v2 = pop(pilha)
            v1 = pop(pilha)
            expr = f"({v1} {crt} {v2})"
            push(pilha, expr)
    
    return pop(pilha)

def calcPrefixa(epre):
    """Calcula uma expressão pré-fixa"""
    pilha = []
    
    # Percorre a expressão da direita para a esquerda
    for crt in reversed(epre):
        if crt.isdigit():  # Se for um número, empilha
            push(pilha, float(crt))
        else:  # Se for um operador, desempilha os dois operandos
            v1 = pop(pilha)
            v2 = pop(pilha)
            if crt == "+":
                r = v1 + v2
            elif crt == "-":
                r = v1 - v2
            elif crt == "*":
                r = v1 * v2
            else:
                r = v1 / v2
            push(pilha, r)  # Empilha o resultado

    return pop(pilha)  # Retorna o resultado final

def intercalarPilhasordemCrescente(p1, p2, p3):
    """Intercala elementos das pilhas em ordem crescente na pilha p3"""
    aux1 = []
    aux2 = []

    while not vazia(p1):
        push(aux1, pop(p1))

    while not vazia(p2):
        push(aux2, pop(p2))

    while not vazia(aux1) and not vazia(aux2):
        v1 = pop(aux1)
        v2 = pop(aux2)
        if v1 < v2:
            push(p3, v1)
            push(aux2, v2)
            push(p1, v1)
        else:
            push(p3, v2)
            push(aux1, v1)
            push(p2, v2)

    while not vazia(aux1):
        v = pop(aux1)
        push(p1, v)
        push(p3, v)

    while not vazia(aux2):
        v = pop(aux2)
        push(p2, v)
        push(p3, v)

    return p3

# -----------------------------
# Tema: Diferenca penultimo, primeiro e ultimo
# -----------------------------


def diferencaElementos(p):
    aux = []

    if vazia(p):
        print("Pilha vazia")
        return
    
    while not vazia(p):
        push(aux, pop(p))

    primeiro = aux[-1]
    ultimo = aux[0]
    penultimo = aux[1]

    while not vazia(aux):
        push(p, pop(aux))

    print(f"Primeiro elemento: {primeiro}")
    print(f"Penultimo elemento: {penultimo}")
    print(f"Ultimo elemento: {ultimo}")
    print(f"Diferenca (Ultimo - Penultimo): {ultimo - penultimo}")
    print(f"Diferenca (Penultimo - Primeiro): {penultimo - primeiro}")

# -----------------------------
# Tema: Diferenca entre A e B
# -----------------------------


def diferencaPilha(a, b):

    aux_a = []
    aux_b = []
    resultado = []

    while not vazia(b):
        push(aux_b, pop(b))

    elementos_b = []
    while not vazia(aux_b):
        elemento = pop(aux_b)
        push(elementos_b,elemento)
        push(b, elemento)

    while not vazia(a):
        elemento = pop(a)
        if elemento not in elementos_b:
            push(resultado, elemento)
        push(aux_a, elemento)

    while not vazia(aux_a):
        push(a, pop(aux_a))

    return resultado


#
def verificaCadeia(cadeia):
    aux = []
    while not vazia(cadeia):
        push(aux, pop(cadeia))
    while not vazia(aux):
        push(cadeia, pop(aux))
    while not vazia(cadeia):
        letra = pop(cadeia)
        if letra != 'a' and letra != 'b':
            return False    
    return True

#escrever uma funcao em python para verificar se uma cadeia é bem formatada no uso de [] e ()
# ememplo [(([]))]

def analisarCadeia(cadeia):
    aux = []
    while not vazia(cadeia):
        push(aux, pop(cadeia))
    while not vazia(aux):
        push(cadeia, pop(aux))
    while not vazia(cadeia):
        letra = pop(cadeia)
        if letra != 'a' and letra != 'b' and letra != '(' and letra != ')':
            return False
    return True

# -----------------------------
# Exemplo de uso
# -----------------------------

p = []
p1 = []
p2 = []
p3 = []

# Preenchendo pilhas para teste
push(p, 5)
push(p, 10)
push(p, 3)
push(p, 7)

push(p1, 10)
push(p1, 10)
push(p1, 20)

push(p2, 30)
push(p2, 40)

print("\n--- Diferenca penultimo, primeiro e ultimo ---")
diferencaElementos(p)

# Exemplo de diferenca entre A e B
A = []
B = []

push(A, 1)
push(A, 2)
push(A, 3)
push(A, 4)

push(B, 3)
push(B, 5)

print("\n--- Diferenca entre A e B ---")
resultado = diferencaPilha(A, B)
mostrarPilha(resultado)
print('\nValor: ', calcPrefixa('"+ 3 5" '))
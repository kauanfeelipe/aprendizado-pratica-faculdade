def binario(n):
    if n ==0:
        return
    else:
        binario(n // 2)
        print(n % 2, end='')

def contar_digitos(n): 
    if n == 0:
        return 0
    else:
        return 1 + contar_digitos(n // 10)

def inverterNumero(num,n):
    if n == 0:
        return 0
    else:
        return (num % 10) * (10 ** (n - 1)) + inverterNumero(num // 10, n - 1)

def calcularPotencia(x,n):
    if n == 0:
        return 1
    if n  > 0:
        return x * calcularPotencia(x, n - 1)
    else:
        return 1 / x * calcularPotencia(x, n + 1)


#calcular a multiplicação russa  de dois numeros, função recursiva

def multiplicacao_russa(n,x):
    if n== 0:
        return 0
    if n % 2 != 0:
        return x + multiplicacao_russa(n // 2, x * 2)
    else:
        return multiplicacao_russa(n // 2, x * 2) 

#função recursiva para retornar a soma dos elementos de um vetor de inteiros

# def somaElementos(vetor):
#     if not vetor:
#         return 0
#     else:
#         return vetor[0] + somaElementos(vetor[1:])

def somaElementos(vetor,tamanho):
    if tamanho == 0:
        return 0
    else:
        return somaElementos(vetor, tamanho - 1) + vetor[tamanho - 1]

#função recursiva para retornar a soma dos elementos positivos de um vetor
def somaPositivos(vetor, tamanho):
    if tamanho == 0:
        return 0
    else:
        if vetor[tamanho - 1] > 0:
            return somaPositivos(vetor, tamanho - 1) + vetor[tamanho - 1]
        else:
            return somaPositivos(vetor, tamanho - 1)

#função recursiva para retornar o maior elemento de um vetor de inteiros
def maiorElemento(vetor, tamanho):
    if tamanho == 1:
        return vetor[0]
    else:
        valor = maiorElemento(vetor, tamanho - 1)
        if valor > vetor[tamanho - 1]:
            return valor
        else:
            return vetor[tamanho - 1]
        
#função recursiva para retornar a posição do maior do vetor
def posicaoMaiorElemento(vetor, tamanho):
    if tamanho == 1:
        return 0
    else:
        posicao = posicaoMaiorElemento(vetor, tamanho - 1)
        if vetor[tamanho - 1] > vetor[posicao]:
            return tamanho - 1
        else:
            return posicao

#função recursiva para verificar se um vetor de inteiros é palindromo , retorna true se sim ou false se nao
def ehPalindromo(vetor, inicio, fim):
    if inicio >= fim:
        return True
    if vetor[inicio] != vetor[fim]:
        return False
    return ehPalindromo(vetor, inicio + 1, fim - 1)


#função recursiva para calcular o resto da  divisão inteira entre dois numeros , utilizando subtração sucessivas

def restoDivisao(a, b):
    if a < b:
        return a
    return restoDivisao(a - b, b)

print('Binario')
binario(13)
print()
print(f'Número de dígitos: {contar_digitos(1341)}')
print(f'Número invertido: {inverterNumero(1341, 4)}')

print(f'3^2 = {calcularPotencia(3, 2)}')
print(f'2^-3 = {calcularPotencia(2, -3)}')

print(f'Multiplicação russa de 35 e 42: {multiplicacao_russa(35, 42)}')

print(f'Soma dos elementos do vetor: {somaElementos([1,2,3,4], 4)}')

print(f'Soma dos elementos positivos do vetor: {somaPositivos([1,-2,3,4], 4)}')

print(f'Maior elemento do vetor: {maiorElemento([1,-2,10,4], 4)}')

print(f'Posição do maior elemento do vetor: {posicaoMaiorElemento([1,-2,10,4], 4)}')

print(f'O vetor é palíndromo: {ehPalindromo([1,2,3,2,1], 0, 4)}')

print(f'Resto da divisão de 20 por 6: {restoDivisao(20, 6)}')

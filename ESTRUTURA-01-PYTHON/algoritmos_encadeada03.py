class ListaNo:

    def __init__(self,info):
        self.info=info
        self.proximo=None

    def __str__(self):
        return f'Valor info: {self.info}'

class ListaLigada:

    def __init__(self):
        self.inicio=None

    def insereInicio(self,info):
        no=ListaNo(info)
        no.proximo=self.inicio
        self.inicio=no

    def removeInicio(self):
        aux=self.inicio
        if aux:
            self.inicio=aux.proximo

    def existeElemento(self,x):
        p=self.inicio
        encontrou=False
        while p and not encontrou:
            if x == p.info:
                encontrou=True
            p=p.proximo

        return encontrou


    def mostraLista(self):
        atual=self.inicio
        while atual:
            print(f'Valor no: {atual.info}')
            atual=atual.proximo


    def contaNoLista(self):
        atual=self.inicio
        cont=0
        while atual:
            cont=cont+1
            atual=atual.proximo

        print(f'Tamanho da lista: {cont}')


    def insereUltimo(self,info):
        atual=self.inicio
        if not atual:
            self.insereInicio(info)
            return
        while atual.proximo:
            atual=atual.proximo
        no = ListaNo(info)
        atual.proximo=no

    def removeUltimo(self):
        p=None
        q=self.inicio
        if not q:
            print(f'lista vazia')
            return

        while q.proximo:
            p=q
            q=q.proximo

        if p==None:
            self.inicio=None
        else:
            p.proximo=None


    def insereDepois(self,p,info):
        no = ListaNo(info)
        no.proximo=p.proximo
        p.proximo=no

    def removeDepois(self,p):
        aux=p.proximo
        p.proximo=aux.proximo


    def insereOrdenado(self,x):
        p=self.inicio
        if not p or x < p.info:
            self.insereInicio(x)
            return
        q = p

        while q and q.info < x :
            p=q
            q=q.proximo

        if not q or q.info >x :
            self.insereDepois(p,x)
        else:
            print(f'Elemento anteriormente cadastrado')
            
    def insereOrdenado2(self,x):
        p = self.inicio
        cont = 0
        if not p or x < p.info:
            self.insereInicio(x)
            return
        q = p
        while q and q.info <= x:
            if q.info == x:
                cont = cont + 1
            p = q
            q = q.proximo
        if cont < 2 :
            self.insereDepois(p, x)
        else:
            print(f'Elemento {x} cadastrado {cont} vezes')
            

    def removeOrdenado(self,x):
        p=self.inicio
        if not p:
            print(f'lista vazia')
            return

        if p.info==x:
            self.removeInicio()
            return

        q=p
        while q and q.info < x:
            p=q
            q=q.proximo

        if q and q.info==x:
            self.removeDepois(p)
        else:
            print(f'elemento nao encontrado')

    def removePrimeiroUltimo(self):
        if self.inicio == None:
            return
        self.inicio=self.inicio.proximo

        if self.inicio==None:
            return

        if self.inicio.proximo ==None:
            self.inicio=None
            return

        p=self.inicio
        q=p.proximo
        while q.proximo!=None:
            p=q
            q=p.proximo

        p.proximo=None
    # retornar a quantidade de ocorencias de um determinado valor na lista
    def contaOcorrencias(self,x):
        p=self.inicio
        cont = 0
        while p:
            if p.info==x:
                cont=cont+1
            p=p.proximo
        return cont
    # retornar a posicao da primeira ocorrencia de um determinado valor na lista
    def primeiraOcorrencia(self,x):
        pos = 0
        atual = self.inicio
        while atual:
            pos += 1
            if atual.info == x:
                return pos
            atual = atual.proximo
        return -1  # Retorna -1 se o elemento não for encontrado
    

    # retornar todas as posicoes que um elemento aparece na lista
    def posicoesOcorrencias(self,x):
        p=self.inicio
        cont=0
        listaPosicoes=[]
        while p:
            cont=cont+1
            if p.info==x:
                listaPosicoes.append(cont)
            p=p.proximo

        return listaPosicoes
    # retirar de uma lista os elementos repetidos
    def removeRepetidos(self):
        atual = self.inicio
        while atual:
            anterior = atual
            corrente = atual.proximo
            while corrente:
                if corrente.info == atual.info:
                    self.removeDepois(anterior)
                    corrente = anterior.proximo
                else:
                    anterior = corrente
                    corrente = corrente.proximo
            atual = atual.proximo
        

    
    
    def intercalaLista(l1,l2,l3):
        p1 = l1.inicio
        p2 = l2.inicio
        while p1 and p2:
            l3.insereUltimo(p1.info)
            l3.insereUltimo(p2.info)
            p1 = p1.proximo
            p2 = p2.proximo

        while p1:
            l3.insereUltimo(p1.info)
            p1 = p1.proximo

        while p2:
            l3.insereUltimo(p2.info)
            p2 = p2.proximo
        


lista1 = ListaLigada()
lista2 = ListaLigada()

lista1.insereInicio(50)
lista1.insereInicio(20)
lista1.insereInicio(102)
lista1.insereInicio(200)


lista2.insereInicio(1)
lista2.insereInicio(55)
lista2.insereInicio(50)
lista2.insereInicio(4000)




# lista = ListaLigada()
# lista2=ListaLigada()
# lista.insereInicio(50)
# lista.insereInicio(20)
# lista.insereInicio(102)
# lista.insereUltimo(10)
# lista2.insereInicio(1)
# lista2.insereInicio(2)
# lista2.insereInicio(3)
# lista2.insereInicio(3)
# print(f'Mostra 1')
# lista.mostraLista()
# print(f'Mostra 2')
# lista2.mostraLista()
# lista3=ListaLigada()
# lista3.insereOrdenado(20)
# lista3.insereOrdenado(10)
# #lista3.insereOrdenado(30)
# #lista3.insereOrdenado(50)
# #lista3.insereOrdenado(1)
# print(f'Mostra 3')
# lista3.mostraLista()
# lista3.removePrimeiroUltimo()
# print('\n')
# lista3.mostraLista()
print('contagem de elementos')
print(lista2.contaOcorrencias(200))
print('primeira ocorrencia')
print(lista2.primeiraOcorrencia(1))
print('posicoes ocorrencias')
print(lista2.posicoesOcorrencias(1))
# lista2.removeRepetidos(3)
# print('repetidos removidos')
# lista2.mostraLista()
print('intercalando listas')
lista3=ListaLigada()
lista3.intercalaLista(lista1, lista2, lista3)
print('Lista intercalada')
lista3.mostraLista()







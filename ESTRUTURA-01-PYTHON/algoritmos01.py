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


lista1 = ListaLigada()
lista2 = ListaLigada()

lista1.insereInicio(50)
lista1.insereInicio(20)
lista1.insereInicio(102)
lista1.insereUltimo(10)

lista2.insereInicio(1)
lista2.insereInicio(20)
lista2.insereInicio(50)



lista = ListaLigada()
lista2=ListaLigada()
lista.insereInicio(50)
lista.insereInicio(20)
lista.insereInicio(102)
lista.insereUltimo(10)
lista2.insereInicio(1)
lista2.insereInicio(2)
lista2.insereInicio(3)
print(f'Mostra 1')
lista.mostraLista()
print(f'Mostra 2')
lista2.mostraLista()
lista3=ListaLigada()
lista3.insereOrdenado(20)
lista3.insereOrdenado(10)
#lista3.insereOrdenado(30)
#lista3.insereOrdenado(50)
#lista3.insereOrdenado(1)
print(f'Mostra 3')
lista3.mostraLista()
lista3.removePrimeiroUltimo()
print('\n')
lista3.mostraLista()


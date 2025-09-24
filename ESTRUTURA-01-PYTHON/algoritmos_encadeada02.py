# Classe que representa um nó da lista encadeada
class ListaNo:
    def __init__(self, info):
        self.info = info          # Armazena o valor (informação) do nó
        self.proximo = None       # Ponteiro para o próximo nó na lista (inicia como None)
# Classe que representa a lista ligada como um todo
class ListaLigada:
    def __init__(self):
        self.inicio = None        # Início da lista (vazio no começo, ou seja, lista está vazia)

    # Método para inserir um novo nó no início da lista
    def insereInicio(self , info):
        no = ListaNo(info)             # Cria um novo nó com a informação desejada
        no.proximo = self.inicio       # Faz o novo nó apontar para o antigo primeiro nó
        self.inicio = no               # Atualiza o início da lista para ser o novo nó

    # Método para remover o primeiro nó da lista
    def removeInicio(self):
        aux = self.inicio              # Guarda a referência do primeiro nó
        if aux:                        # Se a lista não estiver vazia
            self.inicio = aux.proximo # Atualiza o início para o próximo nó (remove o primeiro)

    # Método para mostrar todos os valores da lista
    def mostrarLista(self):
        atual = self.inicio            # Começa pelo início da lista
        while atual:                   # Enquanto houver nós na lista
            print(atual.info)         # Imprime a informação do nó atual
            atual = atual.proximo     # Avança para o próximo nó

    # Método para inserir um novo nó depois de um nó específico 'p'
    def insereDepois(self, p, info):
        
        no = ListaNo(info)            # Cria um novo nó com a informação
        no.proximo = p.proximo        # Novo nó aponta para o próximo nó de 'p'
        p.proximo = no                # 'p' agora aponta para o novo nó

        
    def insereOrdenado(self,x):
        p = self.inicio
        if not p or x < p.info:
            self.insereInicio(x)
            return
        q = p
        
        while q and q.info < x:
            p = q
            q = q.proximo
            
        if not q or q.info >x:
            self.insereDepois(p,x)
        else:
            print("Elemento anteriormente cadastrado")
        
            
        
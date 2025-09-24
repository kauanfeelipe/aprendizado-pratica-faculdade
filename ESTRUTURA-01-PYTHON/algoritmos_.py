#KAUAN FELIPE DA SILVA - 40809013
def inserir(f, v):
    f.append(v)  
    
def retirar(f):
    return f.pop(0)  

def vazia_fila(f):
    return False if f else True

def push(p, v):
    p.append(v)  
def pop(p):
    return p.pop()  

def vazia(p):
    return False if p else True 

def mostrar_fila(f):
    aux = []
    while not vazia_fila(f):
        v = retirar(f)
        inserir(aux, v)
    while not vazia(aux):
        v = retirar(aux)
        print(v)  
        inserir(f, v)
def inserirCompanhia(fila, nomeCompanhia):
    companhia = {'nome': nomeCompanhia, 'voos': []}
    inserir(fila, companhia)
    
def adicionarVoo(fila, nomeCompanhia, codigo, destino, horario):
    voo = {'codigo': codigo, 'destino': destino, 'horario': horario}
    aux = []
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        if companhia_atual['nome'] == nomeCompanhia:
            push(companhia_atual['voos'], voo)
            inserir(fila, companhia_atual)
            return
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))
    print("Companhia não encontrada!")

def atenderVoo(fila):
    if vazia_fila(fila):
        print("Fila vazia! Não há companhias para atender.")
        return 
    companhia_atual = retirar(fila)
    if not vazia(companhia_atual['voos']):  
        voo_atendido = pop(companhia_atual['voos'])  
        print(f"Voo atendido: {voo_atendido['codigo']} da companhia {companhia_atual['nome']}.")   
        if vazia(companhia_atual['voos']):  
            print(f"A companhia {companhia_atual['nome']} foi removida da fila com sucesso.")
        else:
            inserir(fila, companhia_atual)
    else:
        print(f"A pilha de voos da companhia {companhia_atual['nome']} está vazia.")
        print(f"Removendo a companhia {companhia_atual['nome']} da fila.")

def removerCompanhia(fila, nomeCompanhia):
    aux = []
    encontrada = False
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        if companhia_atual['nome'] == nomeCompanhia:
            encontrada = True
            print(f"Companhia {nomeCompanhia} removida da fila com sucesso.")
            continue  
        inserir(aux, companhia_atual)  
    while not vazia(aux):
        inserir(fila, pop(aux))
    if not encontrada:
        print(f"Companhia {nomeCompanhia} não encontrada na fila.")
        
def cancelarVoo(fila, nomeCompanhia, codigoVoo):
    aux = []
    voo_cancelado = False
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        if companhia_atual['nome'] == nomeCompanhia:
            aux_voos = []
            while not vazia(companhia_atual['voos']):
                voo_atual = pop(companhia_atual['voos'])
                if voo_atual['codigo'] == codigoVoo:
                    voo_cancelado = True
                    print(f"Voo {codigoVoo} cancelado da companhia {nomeCompanhia}.")
                else:
                    inserir(aux_voos, voo_atual) 
            while not vazia(aux_voos):
                push(companhia_atual['voos'], pop(aux_voos))
        inserir(aux, companhia_atual) 
    while not vazia(aux):
        inserir(fila, pop(aux))
    if not voo_cancelado:
        print(f"Voo {codigoVoo} não encontrado na companhia {nomeCompanhia}.")

def suspenderVoo(fila, nomeCompanhia, codigoVoo):
    aux = []
    voo_encontrado = False
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        if companhia_atual['nome'] == nomeCompanhia:
            voo_suspenso = None
            aux_voos = []
            while not vazia(companhia_atual['voos']):
                voo_atual = pop(companhia_atual['voos'])
                if voo_atual['codigo'] == codigoVoo:
                    voo_encontrado = True
                    voo_suspenso = voo_atual  
                else:
                    push(aux_voos, voo_atual)  
            if voo_encontrado:
                push(companhia_atual['voos'], voo_suspenso)  
            while not vazia(aux_voos):
                push(companhia_atual['voos'], pop(aux_voos))  
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))
    if not voo_encontrado:
        print(f"Voo {codigoVoo} não encontrado na companhia {nomeCompanhia}.")
    else:
        print(f"Voo {codigoVoo} suspenso com sucesso na companhia {nomeCompanhia}.")

def trocarVoos(fila, nomeCompanhia, codigoVoo1, codigoVoo2):
    aux = []
    voo1_encontrado = False
    voo2_encontrado = False
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        if companhia_atual['nome'] == nomeCompanhia:
            voo1 = None
            voo2 = None
            outros_voos = []
            while not vazia(companhia_atual['voos']):
                voo_atual = pop(companhia_atual['voos'])
                if voo_atual['codigo'] == codigoVoo1:
                    voo1 = voo_atual
                    voo1_encontrado = True
                elif voo_atual['codigo'] == codigoVoo2:
                    voo2 = voo_atual
                    voo2_encontrado = True
                else:
                    push(outros_voos, voo_atual)
            voos_na_ordem_original = []
            while not vazia(outros_voos):
                push(voos_na_ordem_original, pop(outros_voos))
            if voo1_encontrado and voo2_encontrado:
                while not vazia(voos_na_ordem_original):
                    voo_atual = pop(voos_na_ordem_original)
                    push(companhia_atual['voos'], voo_atual)
                push(companhia_atual['voos'], voo1)  
                push(companhia_atual['voos'], voo2)  
                print(f"Voos {codigoVoo1} e {codigoVoo2} trocados com sucesso.")
            else:
                while not vazia(voos_na_ordem_original):
                    push(companhia_atual['voos'], pop(voos_na_ordem_original))
                if voo1_encontrado:
                    push(companhia_atual['voos'], voo1)
                if voo2_encontrado:
                    push(companhia_atual['voos'], voo2)
                print("Um ou ambos os voos não foram encontrados.")
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))
        
def mostrarCompanhiaVoo(fila):
    if vazia_fila(fila):
        print("Não há companhias cadastradas.")
        return
    aux = []
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        print(f"Companhia: {companhia_atual['nome']}")
        if vazia(companhia_atual['voos']):
            print("  Sem voos cadastrados.")
        else:
            print("  Voos:")
            aux_voos = []         
            while not vazia(companhia_atual['voos']):
                voo_atual = pop(companhia_atual['voos'])
                print(f"   - Voo: {voo_atual['codigo']} - Destino: {voo_atual['destino']} - Horário: {voo_atual['horario']}")
                push(aux_voos, voo_atual) 
            while not vazia(aux_voos):
                push(companhia_atual['voos'], pop(aux_voos))
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))

def buscarVoosDestino(fila, destino):
    aux = []
    voos_encontrados = False
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        aux_voos = []
        while not vazia(companhia_atual['voos']):
            voo_atual = pop(companhia_atual['voos'])
            if voo_atual['destino'] == destino:
                print(f"Companhia: {companhia_atual['nome']} - Voo: {voo_atual['codigo']} - Horário: {voo_atual['horario']}")
                voos_encontrados = True
            push(aux_voos, voo_atual)  
        while not vazia(aux_voos):
            push(companhia_atual['voos'], pop(aux_voos))
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))
    if not voos_encontrados:
        print(f"Nenhum voo encontrado para o destino {destino}.")

def mostrarEstatisticas(fila):
    total_companhias = 0
    total_voos = 0
    maior_voos = 0
    companhia_maior_voos = "Nenhuma"
    aux = []
    while not vazia_fila(fila):
        companhia_atual = retirar(fila)
        total_companhias += 1
        aux_voos = []
        num_voos = 0
        while not vazia(companhia_atual['voos']):
            voo = pop(companhia_atual['voos'])
            push(aux_voos, voo)
            num_voos += 1
        while not vazia(aux_voos):
            push(companhia_atual['voos'], pop(aux_voos))
        total_voos += num_voos
        if num_voos > maior_voos:
            maior_voos = num_voos
            companhia_maior_voos = companhia_atual['nome']
        inserir(aux, companhia_atual)
    while not vazia(aux):
        inserir(fila, pop(aux))
    
    print(f"Total de companhias: {total_companhias}")
    print(f"Total de voos cadastrados: {total_voos}")
    print(f"Companhia com mais voos: {companhia_maior_voos} ({maior_voos} voos)")
    




fila_companhias = []  
inserirCompanhia(fila_companhias, "GOL")
inserirCompanhia(fila_companhias, "TAM")
inserirCompanhia(fila_companhias, "KauanViagens")
adicionarVoo(fila_companhias, "GOL", "A103", "São Paulo", "13:00")
adicionarVoo(fila_companhias, "TAM", "A102", "Rio de Janeiro", "11:00")
adicionarVoo(fila_companhias, "KauanViagens", "B201", "Belo Horizonte", "12:00")
print("Fila de Companhias e seus Voos:")
mostrar_fila(fila_companhias)
# mostrarCompanhiaVoo(fila_companhias)
# buscarVoosDestino(fila_companhias, "São Paulo")
mostrarEstatisticas(fila_companhias)
# suspenderVoo(fila_companhias, "GOL", "A103")
# atenderVoo(fila_companhias)
# removerCompanhia(fila_companhias, "KauanViagens")
# cancelarVoo(fila_companhias, "GOL", "A103")

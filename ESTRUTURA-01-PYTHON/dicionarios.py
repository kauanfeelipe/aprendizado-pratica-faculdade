def incluiRepositorio(repositorio, nome, nota):
        aluno = {
            'nome': nome,
            'notaProva':nota
        }
        repositorio.append(aluno)

def mostraRepositorio(repositorio):
    for aluno in repositorio:
        print(f" Nome Aluno: {aluno['nome']}  Nota Aluno: {aluno['notaProva']}")
    return

def mostraNotaMaiorOito(repositorio):
    print("Notas maiores que 8")
    for aluno in repositorio:
        if aluno['notaProva']> 8:
            print(f" Nome Aluno: {aluno['nome']}  Nota Aluno: {aluno['notaProva']}")

def mostraNotaMenorSeis(repositorio):
    print("Notas menores que 6")
    for i in range(len(repositorio)):
        if repositorio[i]['notaProva'] < 6:
            print(f"Nome Aluno: {repositorio[i]['nome']}" )
            print(f"Nota Aluno: {repositorio[i]['notaProva']}")


repositorio = []
incluiRepositorio(repositorio, "Leonardo",10)
incluiRepositorio(repositorio, "Ana",8.5)
incluiRepositorio(repositorio, "Clemencio",7)
incluiRepositorio(repositorio, "Elipdino",5)
incluiRepositorio(repositorio, "Telencio",8)
mostraRepositorio(repositorio)
mostraNotaMaiorOito(repositorio)
mostraNotaMenorSeis(repositorio)



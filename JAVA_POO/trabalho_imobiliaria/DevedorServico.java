// KAUAN FELIPE DA SILVA - 40809013

public class DevedorServico {
    private Devedor[] devedores;

    public DevedorServico(int tamanho) {
        devedores = new Devedor[tamanho]; 
    }

  public void incluir(Devedor d) {
    if (d == null) {
        System.out.println("Devedor inválido. Inclusão não realizada.");
        return;
    }
    for (int i = 0; i < devedores.length; i++) {
        if (devedores[i] == null) {
            devedores[i] = d;
            System.out.println("Devedor incluído na posição: " + i);
            return;
        }
    }
    System.out.println("Vetor cheio. Não é possível incluir.");
}

    public void excluir(String nome) {
        for (int i = 0; i < devedores.length; i++) {
            if (devedores[i] != null && devedores[i].getNome() != null) {
                if (devedores[i].getNome().toLowerCase().equals(nome.toLowerCase())) {
                    devedores[i] = null;
                    System.out.println("Devedor removido.");
                    return;
                }
            }
        }
        System.out.println("Devedor não encontrado.");
    }

    public void mostrar() {
        boolean vazio = true;
        for (int i = 0; i < devedores.length; i++) {
            if (devedores[i] != null) {
                System.out.println("- " + devedores[i].getNome() + " deve R$" + devedores[i].getValorDivida());
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("Nenhum devedor cadastrado.");
        }
    }

    // Retornar um devedor específico (por nome)
    public Devedor buscar(String nome) {
        for (int i = 0; i < devedores.length; i++) {
            if (devedores[i] != null && devedores[i].getNome() != null) {
                if (devedores[i].getNome().toLowerCase().equals(nome.toLowerCase())) {
                    return devedores[i];
                }
            }
        }
        return null;
    }
}

// KAUAN FELIPE DA SILVA - 40809013

public class ParticipacaoProprietario {
    private Proprietario proprietario;
    private double percentual;

    public ParticipacaoProprietario(Proprietario proprietario, double percentual) {
        this.proprietario = proprietario;
        this.percentual = percentual;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    public double getPercentual() {
        return percentual;
    }
    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    public void mostraDados(){
        System.out.println("Proprietario: " + proprietario.getNome());
        System.out.println("Percentual de participacao: " + percentual + "%");
    }
    
}



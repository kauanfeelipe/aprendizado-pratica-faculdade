public class Tecnico extends Funcionario {

    private String setor;

    public Tecnico(String nome, double salario_base, String setor) {
        super(nome, salario_base);
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Setor: " + setor);
    }
}
    

public class Funcionario{
    private String nome;
    private double salario_base;

    public Funcionario(String nome, double salario_base) {
        this.nome = nome;
        this.salario_base = salario_base;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + "\nSalario: " + salario_base);
    }
}
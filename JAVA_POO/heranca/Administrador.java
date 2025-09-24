public class Administrador extends Empregado{

    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double percentualImposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, percentualImposto, nome, endereco, telefone);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public double salarioLiquido() {
        double salarioAdministrador;
        salarioAdministrador = super.salarioLiquido() + ajudaDeCusto;
        return salarioAdministrador;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ajuda de Custo: " + ajudaDeCusto);
        System.out.println("Salario Liquido: " + salarioLiquido());
        
    }
}
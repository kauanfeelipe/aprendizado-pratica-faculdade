public class Fornecedor extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double percentualImposto;

    public Fornecedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double percentualImposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.percentualImposto = percentualImposto;
    }


    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getPercentualImposto() {
        return percentualImposto;
    }
    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public double impostoCalculado() {
        double impostoCalculado;
        impostoCalculado = salarioBase * percentualImposto / 100;
        return impostoCalculado;
    }
    public double salarioLiquido() {
        double salarioLiquido;
        salarioLiquido = salarioBase - impostoCalculado();
        return salarioLiquido;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Liquido: " + salarioLiquido());
    }
}


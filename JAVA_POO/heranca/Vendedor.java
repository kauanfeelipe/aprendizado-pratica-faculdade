public class vendedor extends Empregado{
    private double valorVendas;
    private double percentualComissao;

    public vendedor(double valorVendas, double percentualComissao, int codigoSetor, double salarioBase, double percentualImposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, percentualImposto, nome, endereco, telefone);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    
    public double salarioLiquido() {
        double salarioVendedor;
        salarioVendedor = super.salarioLiquido() + (valorVendas * percentualComissao / 100);
        return salarioVendedor;
    }
}
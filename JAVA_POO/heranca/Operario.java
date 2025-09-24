public class Operario extends Empregado{

    private double valorProducao;
    private double percentuaComissao;

    public Operario(double valorProducao, double percentuaComissao, int codigoSetor, double salarioBase, double percentualImposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, percentualImposto, nome, endereco, telefone);
        this.valorProducao = valorProducao;
        this.percentuaComissao = percentuaComissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getPercentuaComissao() {
        return percentuaComissao;
    }
    public void setPercentuaComissao(double percentuaComissao) {
        this.percentuaComissao = percentuaComissao;
    }

    public double salarioLiquido() {
        double salarioOperario;
        salarioOperario = super.salarioLiquido() + (valorProducao * percentuaComissao / 100);
        return salarioOperario;

    }

}
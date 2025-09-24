// KAUAN FELIPE DA SILVA - 40809013

public class ContratoVenda extends Contrato{
    private Pessoa comprador;
    private Corretor corretor;
    private double percentualImobiliaria;
    private double percentualCorretor;

    public ContratoVenda(Imovel imovel, String dataInicio, double valorPrincipal, 
                         Pessoa comprador, Corretor corretor, double percentualImobiliaria,
                         double percentualCorretor) {
        super(imovel, dataInicio, valorPrincipal);
        this.comprador = comprador;
        this.corretor = corretor;
        this.percentualImobiliaria = percentualImobiliaria;
        this.percentualCorretor = percentualCorretor;
    }
    public Pessoa getComprador() {
        return comprador;
    }
    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }
    public Corretor getCorretor() {
        return corretor;
    }
    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
    public double getPercentualImobiliaria() {
        return percentualImobiliaria;
    }
    public void setPercentualImobiliaria(double percentualImobiliaria) {
        this.percentualImobiliaria = percentualImobiliaria;
    }
    public double getPercentualCorretor() {
        return percentualCorretor;
    }
    public void setPercentualCorretor(double percentualCorretor) {
        this.percentualCorretor = percentualCorretor;
    }


    public void processarMensalidade() {
        double valorPrincipal = getValorPrincipal();
        double comissaoCorretor = valorPrincipal * (percentualCorretor / 100);
        double comissaoImobiliaria = valorPrincipal * (percentualImobiliaria / 100);
        double valorLiquido = valorPrincipal - comissaoCorretor - comissaoImobiliaria;

        // Adiciona a comissão ao corretor
        corretor.adicionarComissao(comissaoCorretor);

        // Aqui assumindo que Imovel tem método para listar participações
        // (como o listaParticipacaoProprietario() que implementamos anteriormente)
        if (getImovel() != null) {
            getImovel().listaParticipacaoProprietario(valorLiquido);
        }
    }

}

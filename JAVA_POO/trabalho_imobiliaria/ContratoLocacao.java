// KAUAN FELIPE DA SILVA - 40809013

public class ContratoLocacao extends Contrato{
    private Locatario locatario;
    private boolean encerrado;
    private boolean atraso;
    private DevedorServico devserv;
    private double multaAtraso;
    private double multaRescisao;
    private boolean vistoriaAprovada;

        public ContratoLocacao(int numeroContrato, String dataInicio, String dataFim, 
                         double valorAluguel, Imovel imovel, Locatario locatario,
                         boolean encerrado, DevedorServico devserv, double multaAtraso,
                         double multaRescisao, boolean vistoriaAprovada) {
        
        super(numeroContrato, dataInicio, dataFim, valorAluguel, imovel);
        this.locatario = locatario;
        this.encerrado = encerrado;
        this.devserv = devserv;
        this.multaAtraso = multaAtraso;
        this.multaRescisao = multaRescisao;
        this.vistoriaAprovada = vistoriaAprovada;
    }

    public Locatario getLocatario() {
        return locatario;
    }
    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }
    public boolean isEncerrado() {
        return encerrado;
    }
    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }
    public boolean isAtraso() {
    return atraso;
}

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public DevedorServico getDevserv() {
        return devserv;
    }
    public void setDevserv(DevedorServico devserv) {
        this.devserv = devserv;
    }
    public double getMultaAtraso() {
        return multaAtraso;
    }
    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }
    public double getMultaRescisao() {
        return multaRescisao;
    }
    public void setMultaRescisao(double multaRescisao) {
        this.multaRescisao = multaRescisao;
    }
    public boolean isVistoriaAprovada() {
        return vistoriaAprovada;
    }
    public void setVistoriaAprovada(boolean vistoriaAprovada) {
        this.vistoriaAprovada = vistoriaAprovada;
    }

    public void registrarAtraso() {
        this.atraso = true;
        if (devserv != null) {
            double valorPrincipal = getValorAluguel() + multaAtraso;
            devserv.incluir(locatario, valorPrincipal);
        }
    }

    public void encerrarComVistoria(boolean vistoriaAprovada) {
        this.vistoriaAprovada = vistoriaAprovada;
        this.encerrado = true;
        
        if (vistoriaAprovada) {
            System.out.println("Vistoria aprovada. Contrato encerrado");
        } else {
            System.out.println("Vistoria reprovada! Inquilino deve realizar os reparos.");
        }
    }

    public void processarMensalidade() {
        if (encerrado) {
            System.out.println("Contrato encerrado. Não há mensalidade a processar.");
            return;
        }
        
        Imovel imovel = getImovel();
        if (imovel == null) {
            System.out.println("Erro: Imóvel não definido para este contrato.");
            return;
        }
        
        double valorPrincipal = getValorPrincipal();
        double valorIPTU = imovel.getValorIPTU();
        double valorAluguel = valorPrincipal + valorIPTU;
        double taxaAdministracao = valorPrincipal * 0.10;
        double valorLiquido = valorAluguel - taxaAdministracao;
        
        List<Pessoa> proprietarios = imovel.getProprietarios();
        if (proprietarios != null && !proprietarios.isEmpty()) {
            double valorPorProprietario = valorLiquido / proprietarios.size();
            
            System.out.println("\n=== PARTICIPAÇÃO DOS PROPRIETÁRIOS NO ALUGUEL ===");
            for (Pessoa proprietario : proprietarios) {
                System.out.printf("Proprietário: %s - Valor: R$%.2f\n", 
                                proprietario.getNome(), valorPorProprietario);
            }
        } else {
            System.out.println("Nenhum proprietário registrado para este imóvel.");
        }
    }



}
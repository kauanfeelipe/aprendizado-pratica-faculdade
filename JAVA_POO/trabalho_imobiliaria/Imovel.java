// KAUAN FELIPE DA SILVA - 40809013

public abstract class Imovel {
    private String endereco;
    private double valorBaseLocacao;
    private double valorBaseVenda;
    private double valorIptu;
    private int idImovel;
    private ParticipacaoProprietario[] participacoes = new ParticipacaoProprietario[10]; 

    public Imovel(String endereco, double valorBaseLocacao, double valorBaseVenda, double valorIptu, int idImovel) {
        this.endereco = endereco;
        this.valorBaseLocacao = valorBaseLocacao;
        this.valorBaseVenda = valorBaseVenda;
        this.valorIptu = valorIptu;
        this.idImovel = idImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }

    public double getValorBaseVenda() {
        return valorBaseVenda;
    }

    public void setValorBaseVenda(double valorBaseVenda) {
        this.valorBaseVenda = valorBaseVenda;
    }

    public double getValorIptu() {
        return valorIptu;
    }

    public void setValorIptu(double valorIptu) {
        this.valorIptu = valorIptu;
    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public void incluiParticipacaoProprietario(Proprietario prop, double percentual) {
        ParticipacaoProprietario participacao = new ParticipacaoProprietario(prop, percentual);
        for (int i = 0; i < this.participacoes.length; i++) {
            if (this.participacoes[i] == null) {
                this.participacoes[i] = participacao;
                break;
            }
        }
    }
    // da clase  acima n permitir incluir porprietario duplicado,verificar se ja existe,ter cpf como chave pesquisa
    public void excluiParticipacaoProprietario(Proprietario prop) {
        for (int i = 0; i < this.participacoes.length; i++) {
            if (this.participacoes[i] != null && this.participacoes[i].getProprietario().equals(prop)) {
                this.participacoes[i] = null;
                break;
            }
        }
    }

    public void listaParticipacaoProprietario() {
        for (int i = 0; i < this.participacoes.length; i++) {
            if (this.participacoes[i] != null) {
                System.out.println("Proprietário: " + this.participacoes[i].getProprietario().getNome() + 
                                 ", Percentual: " + this.participacoes[i].getPercentual());
            }
        }
    }
    public void mostraDados() {
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Valor Base Locação: " + this.valorBaseLocacao);
        System.out.println("Valor Base Venda: " + this.valorBaseVenda);
        System.out.println("Valor IPTU: " + this.valorIptu);
        System.out.println("ID Imóvel: " + this.idImovel);
    }
    public abstract double calcularTaxaAdministracao();
}
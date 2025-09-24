// KAUAN FELIPE DA SILVA - 40809013

public class ImovelMisto extends Imovel{

    public ImovelMisto(String endereco, double valorBaseLocacao, double valorBaseVenda, double valorIptu, int idImovel) {
        super(endereco, valorBaseLocacao, valorBaseVenda, valorIptu, idImovel);
    }

    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.07;
    }
}
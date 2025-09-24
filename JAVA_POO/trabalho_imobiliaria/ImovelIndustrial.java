// KAUAN FELIPE DA SILVA - 40809013

public class ImovelIndustrial extends Imovel{
    
    public ImovelIndustrial(String endereco, double valorBaseLocacao, double valorBaseVenda, double valorIptu, int idImovel) {
        super(endereco, valorBaseLocacao, valorBaseVenda, valorIptu, idImovel);
    }
    
    public double calcularTaxaAdministracao() {
        return getValorBaseLocacao() * 0.08;
    }
}
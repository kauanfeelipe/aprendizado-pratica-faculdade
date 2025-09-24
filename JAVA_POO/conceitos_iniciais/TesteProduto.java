public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        Produto p2 = new Produto();
        p.setNomeProduto("Biscoito");
        p.setQuantidadeEstoque(50);
        p.setPrecoProduto(1.700);
        p.setPercentualImposto(20);


        p2.setNomeProduto("Sucuzinho");
        p2.setQuantidadeEstoque(1);
        p2.setPrecoProduto(50);
        p2.setPercentualImposto(0.7);


        System.out.println("Nome produto: " + p2.getNomeProduto());
        System.out.println("Quantidade de estoque: " + p2.getQuantidadeEstoque());
        System.out.println("Preço do produto: " +  p2.getPrecoProduto());
        System.out.println("Percentual imposto: " + p2.getPercentualImposto());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Nome produto: " + p.getNomeProduto());
        System.out.println("Quantidade de estoque: " + p.getQuantidadeEstoque());
        System.out.println("Preço do produto: " +  p.getPrecoProduto());
        System.out.println("Percentual imposto: " + p.getPercentualImposto());

        p.entradaProduto(20);
        p2.entradaProduto(30);
        p2.saidaProduto(1);
    }
}

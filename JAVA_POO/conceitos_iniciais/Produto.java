public class Produto {
    private String nomeProduto ;
    private int quantidadeEstoque;
    private double precoProduto;
    private double percentualImposto;
    private int entradaProduto;





    public String getNomeProduto(){
        return nomeProduto;

    }
    public void setNomeProduto(String n){
        nomeProduto = n;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int q){
        quantidadeEstoque = q;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(double p){
        precoProduto = p;

    }

    public double getPercentualImposto(){
        return percentualImposto;


    }

    public void setPercentualImposto(double pi){
        if(pi >= 0.5 && pi <= 15 ){
            percentualImposto = pi;

        }
        else {
            System.out.println("Valor invalido");
            percentualImposto = 6;
        }
    }



    public void entradaProduto(int quantidade){
        if (quantidade <= 0){
            System.out.println("Valor nao valido para estoque");
        }
        else{
            quantidadeEstoque = quantidadeEstoque + quantidade;
            System.out.println("Nova quantidade do produto " + nomeProduto + " é " + quantidadeEstoque + ".");
        }
    }
    public void saidaProduto(int quantidade){
        if(quantidade > quantidadeEstoque){
            System.out.println("Quantidade em estoque nao suficiente");
        }
        else{
            quantidadeEstoque = quantidadeEstoque - quantidade;
            System.out.println("Nova quantidade do produto " + nomeProduto + " é " + quantidadeEstoque + ".");
        }

    }



}
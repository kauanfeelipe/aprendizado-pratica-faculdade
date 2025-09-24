public class Produto{
    private int idProduto;
    private String descricao;
    private double preco;

    public Produto(int idProduto, String descricao, double preco) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
    }
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }


}
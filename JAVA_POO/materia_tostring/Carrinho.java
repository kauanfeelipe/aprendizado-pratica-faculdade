import java.util.*;
public class Carrinho{
    private int idCarrinho;
    private Cliente cliente;
    private String data;
    private String situacao;
    private ArrayList<itemCarrinho> itens = new ArrayList<>();
    private static int sequencia;

    
    public Carrinho(Cliente cliente, String data){
        sequencia++;
        idCarrinho = sequencia;
        this.cliente = cliente;
        this.data = data;
        situacao = "aberto";
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getSituacao() {
        return situacao;
    }

    //criar um metodo denominado de fecharCaarinho
    // este metodo altera a situacao do carrinho de 
    // aberto para fechado
    public boolean fecharCarrinho(){
        if(situacao.equalsIgnoreCase("aberto")){
            situacao = "fechado";
            System.out.println("Carrinho fechado com sucesso!");
            return true;
        } else {
            System.out.println("Carrinho já está fechado!");
            return false;
        }
    }

    //criar um metodo para adicionar um item ao carrinho no vetor itens
    // toda vez que um item for adicionado no carrinho deve se 
    //adicionar o valor total do item no atributo debito do cliente
    //antes de adicionar um novo item , verificar se ja existe algum item no arrayList com o msm produto
    // se existir , nao permitir adicionar o item

    public void adicionarItem(Produto p, double quantidade, double preco){
        itemCarrinho ic;
        if(situacao.equalsIgnoreCase("fechado")){
            System.out.println("Não é possível adicionar itens a um carrinho fechado.");
            return;
        }
        if(existeProduto(p.getIdProduto())){
            System.out.println("Produto já existe no carrinho. Não é possível adicionar novamente.");
            return;
        }
        ic = new itemCarrinho(p, quantidade, preco);
        itens.add(ic);
        cliente.setDebito(cliente.getDebito() + p.getPreco() * quantidade);
        System.out.println("Item incluido ao carrinho!");
    }
    public boolean existeProduto(int id){
        for(itemCarrinho ic : itens){
            if(ic.getProduto().getIdProduto() == id){
                return true;
            }
        return false;

        }
    }
    // crfiar um metodo para percorrer o ArrayList e mostrar o seu conteudo

    public void mostraCarrinho(){
        System.out.println("Itens do carrinho");
        for(itemCarrinho ic : itens){
            System.out.println(ic);
        }
    }
    // criar um metodo para retornar o valor total do carrinho
    public double totalCarrinho(){
        double total = 0;
        for(itemCarrinho ic : itens){
            total = total + ic.getQuantidade() * ic.getPreco();
        }
        return total;
    }

    // criar um metodo para mostrar o pedido

    public void mostraDadosCarrinho(){
        System.out.println("Id do Carrinho: " + idCarrinho);
        System.out.println("Cliente : " + cliente);
        System.out.println("Data: " + data);
        System.out.prinln("Situação: " + situacao);
        mostraCarrinho();
        System.out.println("Total do Carrinho: " + totalCarrinho());

    }
    public int obtemPosicaoItem(int id){
        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getProduto().getIdProduto() == id){
                return i;
            }
        }
        return -1; // Retorna -1 se o item não for encontrado
    }

    //criar um metodo para alterar a quantidade de um produto no carrinho
    // a alteração pode ser para mais ou para menos.
    public void alteraItem(int id, double quantidade , boolean tipo){
        //o tipo se for true , acrescenta a quantidadenno item
        //se o tipo for false,decrementa a quandidade do item
        int pos;
        pos = obtemPosicaoItem(id);
        if(pos == -1){
            System.out.println("o id informado nao foi encontrado.");
            return;
        }
        if(tipo){
            //adicionando
            itens.get(pos).setQuantidade(itens.get(pos).getQuantidade() + quantidade);
            cliente.setDebito(cliente.getDebito() + itens.get(pos).getPreco() * quantidade);
        }
        else{
            if(itens.get(pos).getQuantidade() < quantidade){
                System.out.println("Quantidade a ser retirada é maior que a quantidade incluida");
                return;
            }
        }
            //removendo
            itens.get(pos).setQuantidade(itens.get(pos).getQuantidade() - quantidade);
            cliente.setDebito(cliente.getDebito() - itens.get(pos).getPreco() * quantidade);
            if (itens.get(pos).getQuantidade() == 0){
                itens.remove(pos);
            }
            
        }


    }

    
        
    

public class PassagemAerea{
    private String numeroVoo;
    private String companhia;
    private String classePassagem;
    private double preco;

    public PassagemAerea(String num, String comp, String classe, double preco){
        setNumeroVoo(num);
        setCompanhia(comp);
        setClassePassagem(classe);
        setPreco(preco);
    }
    public String getNumeroVoo(){
        return numeroVoo;
    }
    public void setNumeroVoo(String num){
        this.numeroVoo = num;
    }
    public String getCompanhia(){
        return companhia;
    }
    public void setCompanhia(String comp){
        this.companhia = comp;
    }
    public String getClassePassagem(){
        return classePassagem;
    }
    public void setClassePassagem(String classe){
        this.classePassagem = classe;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void MostrarDetalhesPassagemAerea(){
        System.out.println("Numero do voo: " + getNumeroVoo() );
        System.out.println("Companhia: " + getCompanhia());
        System.out.println("Classe da passagem: " + getClassePassagem());
        System.out.println("Preco: " + getPreco());

    }
    
}
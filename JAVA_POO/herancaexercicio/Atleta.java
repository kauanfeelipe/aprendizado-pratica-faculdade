public class Atleta extends Pessoa {

    private double peso;

    public Atleta(double peso, String nome, int idade) {
        super(nome, idade);
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

}
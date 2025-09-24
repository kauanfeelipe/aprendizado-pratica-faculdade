public class Nadador extends Atleta{
    
    private double tempos[] = new double[3];

    public Nadador(double peso, String nome, int idade, double tempo1, double tempo2, double tempo3) {
        super(peso, nome, idade);
        tempos[0] = tempo1;
        tempos[1] = tempo2;
        tempos[2] = tempo3;
    }

    public double getTempos(int indice) {
        return tempos[indice];
    }

    public void setTempos(int indice, double valor) {
        tempos[indice] = valor;
    }

    public double calcularTempoMedia(){
        double tempomedio;
        tempomedio = (tempos[0] + tempos[1] + tempos[2]) / 3;
        return tempomedio;
    
    }
}



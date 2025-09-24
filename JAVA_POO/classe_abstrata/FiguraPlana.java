public abstract class FiguraPlana{

    private int nomeFigura;


    public FiguraPlana(int nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public int getNomeFigura() {
        return nomeFigura;
    }
    public void setNomeFigura(int nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public abstract double calcularArea();
    
}
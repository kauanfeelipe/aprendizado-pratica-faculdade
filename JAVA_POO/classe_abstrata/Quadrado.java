public class  Quadrado extends FiguraPlana{

    private double lado;

    public Quadrado(double lado, int nomeFigura) {
        super(nomeFigura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        double area;
        area = lado * lado;
        return area;
        
    }
}
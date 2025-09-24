public class Retangulo extends FiguraPlana{
    
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, int nomeFigura) {
        super(nomeFigura);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea() {
        double area ;
        area = largura * altura;
        return area;
    }
}
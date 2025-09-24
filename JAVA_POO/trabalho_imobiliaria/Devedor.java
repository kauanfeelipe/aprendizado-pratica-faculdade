// KAUAN FELIPE DA SILVA - 40809013

public class Devedor{
    private Locatario locatario;
    private double debito;

    public Devedor(Locatario locatario, double debito){
        this.locatario = locatario;
        this.debito = debito;
    }

    public Locatario getLocatario(){
        return locarario;
    }
    public void setLocatario(Locatario locatario){
        this.locatario = locatario;

    }
    public double getDebito(){
        return debito;
    }
    public void setDebito(double debito){
        this.debito = debito;
    }
    public void mostraDados(){
        System.out.println("Locatario: " + locatario);
        System.out.println("Debito: " + debito);
    }


}
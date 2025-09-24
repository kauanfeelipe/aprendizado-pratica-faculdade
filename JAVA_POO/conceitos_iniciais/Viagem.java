public class Viagem {
    private String origem;
    private String destino;
    private double distancia;
    private double duracao;

    public Viagem(String ori, String des, double dis, double dur){
        setOrigem(ori);
        setDestino(des);
        setDistancia(dis);
        setDuracao(dur);
    }
    public Viagem(){

    }
    public Viagem(String ori, String des){
        setOrigem(ori);
        setDestino(des);
    }

    public String getOrigem(){
        return origem;
    }   
    public void setOrigem(String ori){
        origem = ori;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String des){
        destino = des;
    }
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double dis){
        distancia = dis;
    }
    public double getDuracao(){
        return duracao;
    }
    public void setDuracao(double dur){
        duracao = dur;
    }
    public void MostrarDetalhes(){
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Distancia: " + distancia);
        System.out.println("Duracao em horas: " + duracao);
    }
}
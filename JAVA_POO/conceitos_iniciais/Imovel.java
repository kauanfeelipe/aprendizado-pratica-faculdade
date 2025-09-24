public class Imovel {
    private String enderecoImovel;
    private int tipoImovel;
    private double valorAluguel;
    private  String nomeLocador;
    private String nomeLocatario;
    private double percentualImobiliaria;


    public String getEnderecoImovel(){
        return  enderecoImovel;
    }
    public void setEnderecoImovel(String ende){
        enderecoImovel = ende;
    }
    public int getTipoImovel(){
        return tipoImovel;
    }
    public void setTipoImovel(int tipo){
        if(tipo < 1 || tipo > 2){

        }
        tipoImovel = tipo;


    }
    public double getValorAluguel(){
        return valorAluguel;
    }
    public void setValorAluguel(double valor){
        valorAluguel = valor;
    }
    public String getNomeLocador(){
        return nomeLocador;
    }
    public void setNomeLocador(String nomeLoc){
        nomeLocador = nomeLoc;
    }
    public String getNomeLocatario(){
        return nomeLocatario;
    }
    public void setNomeLocatario(String locatario){
        nomeLocatario = locatario;
    }

    public double getPercentualImobiliaria(){
        return percentualImobiliaria;
    }
    public void setPercentualImobiliaria(double percen){
        percentualImobiliaria = percen;
    }
}

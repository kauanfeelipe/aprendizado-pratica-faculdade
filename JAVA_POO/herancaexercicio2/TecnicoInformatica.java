public class TecnicoInformatica extends Tecnico {

    private String linguagensConhecidas[] = new String[5];
    private int contadorLinguagem ;
    
    public TecnicoInformatica(String nome, double salario_base, String setor) {
        super(nome, salario_base, setor);
    }
    public void adicionarLinguagens(String linguagem){
        if (contadorLinguagem < linguagensConhecidas.length) {
            linguagensConhecidas[contadorLinguagem] = linguagem;
            contadorLinguagem++;
        }
        else {
            System.out.println("o vetor de linguagens está cheio");
        }
    }
    public void ListarLinguagens(){
        for (int i = 0; i < contadorLinguagem; i++) {
            System.out.println(linguagensConhecidas[i]);
        }
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Linguagens conhecidas: ");
        ListarLinguagens();
    }
}
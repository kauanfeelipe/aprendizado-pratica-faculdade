// KAUAN FELIPE DA SILVA - 40809013

public class Proprietario extends Pessoa{
    private Imovel Imoveis[] = new Imovel[30];

    public Proprietario(String nome, String cpf, String endereco, String[] imoveis) {
        super(nome, cpf, endereco);
    }

    public void adicionarImovel(Imovel imovel) { 
        for (int i = 0; i < Imoveis.length; i++) {
            if(Imovel.getIdImovel() =! Imoveis[i].getIdImovel()){
                if (Imoveis[i] == null) {
                    Imoveis[i] = imovel;
                    break;
                } 
            }
        }
}
    public void retirarImovel( int id) {
        for (int i = 0; i < Imoveis.length; i++) {
            if (Imoveis[i].getIdImovel() == id) {
                Imoveis[i] = null;
                break;
            }
        }
    }

    public void buscarImovel(int id) {
        Imovel imovel = null;
        for (int i = 0; i < Imoveis.length; i++) {
            if (Imoveis[i] == id) {
                imovel = Imoveis[i];
                System.out.println("Imovel encontrado: " + Imoveis[i]);
                break;
            } else {
                System.out.println("Imovel nao encontrado: " + id);
                Imoveis[i] = null;
                break;
            }
        }
    }
    public void listarImoveis() {
        System.out.println("Imoveis do proprietario: ");
        for (int i = 0; i < Imoveis.length; i++) {
            if (Imoveis[i] != null) {
                System.out.println(Imoveis[i]);
            }
        }
    }

    public void mostrarDados(){
        super.mostrarDados();
        listarImoveis();
    }
}
// KAUAN FELIPE DA SILVA - 40809013

public class Corretor extends Pessoa {

    private double valorComissaorecebida;

    public Corretor(String nome, String cpf, String endereco, double valorComissaorecebida) {
        super(nome, cpf, endereco);
        this.valorComissaorecebida = valorComissaorecebida;
    }

    public double getValorComissaorecebida() {
        return valorComissaorecebida;
    }

    public void setValorComissaorecebida(double valorComissaorecebida) {
        this.valorComissaorecebida = valorComissaorecebida;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Valor da comissao recebida: " + valorComissaorecebida);
    }
}

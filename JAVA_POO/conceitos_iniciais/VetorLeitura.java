// para providenciar a leitura dos dados por meio do teclado, Java fornece a classe Scanner.
// a classe scanner esta armazenada em outro local. Para usar a classe Scanner, é necessário importá-la.

import java.util.Scanner;
public class VetorLeitura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // cria um objeto Scanner chamado teclado
        // o system.in é um objeto que representa o teclado da entrada padrão.

        int a;
        System.out.println("Leitura do valor");
        a = teclado.nextInt(); 
        // o metodo nextInt() é usado para ler um valor inteiro do teclado.
        System.out.println("Valor informado: " + a);
    }
}



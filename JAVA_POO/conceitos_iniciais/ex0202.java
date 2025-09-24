import java.util.Scanner;
public class ex0202 {
    
    private int v1[] = new int [10];
    private int v2[] = new int [v1.length];
    private int soma[] = new int[v1.length];
    private int produto [] = new int[v1.length];

    
    public void lerVetor(int vet[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ler Vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.print("vet["+i+"]:");
            vet[i]=teclado.nextInt();
            
        }
    }
    
    public void obtemVetor1(){
        lerVetor(v1);
    }
    
    public void obtemVetor2(){
        lerVetor(v2);
    }
    
    public void mostrarVetor(int vet[]){
        System.out.println("Mostrar Vetor:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet["+i+"]: " + vet[i]);
            
        }
    }

    public void somaVetor(){
       for (int i = 0; i < v1.length; i++) {
          soma[i] = v1[i] + v2[i];
        }
        System.out.println("Mostrar vetor soma");
        mostrarVetor(soma);
    }

    public void produtoVetor(){
       for (int i = 0; i < v1.length; i++) {
          produto[i] = v1[i] * v2[i];
        }
        System.out.println("Mostrar vetor produto");
        mostrarVetor(produto);
    }

    
    
    public static void main(String[] args) {
        ex0202 e = new ex0202();
        e.obtemVetor1();
        e.obtemVetor2();
        e.somaVetor();
        e.produtoVetor();
    }
    
    

   
    
}
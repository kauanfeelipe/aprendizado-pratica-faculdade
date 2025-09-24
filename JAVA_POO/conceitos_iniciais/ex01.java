public class ex01 {
    public static void main(String[] args) {
        int vetor[] = {1, -5, 6, -9, 10,-20, -15, 8};

       
        alternarElementosEntrePositivosENegativos(vetor);
        encontrarsegundomaiorElemento(vetor);
    }

   
    public static void alternarElementosEntrePositivosENegativos(int vetor[]) {
        int[] resultado = new int[vetor.length];
        int index = 0; 
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0 && index < vetor.length) {
                resultado[index++] = vetor[i];
            }
            if (vetor[i] < 0 && index < vetor.length) {
                resultado[index++] = vetor[i];
            }
        }

        System.out.println("Vetor alternado: ");
        for (int i = 0; i < index; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    public static void encontrarsegundomaiorElemento(int vetor[]) {
        int maior = vetor[0];
        int segundoMaior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior && vetor[i] != maior) {
                segundoMaior = vetor[i];
            }
        }
        System.out.println("\nSegundo maior elemento: " + segundoMaior);
        System.out.println("Maior elemento: " + maior);

    }
}
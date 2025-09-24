public class ex02 {
    public static void main(String[] args) {
        int vetorA[] ={2,4,6,8,10,12,14,16,18,20};
        int vetorB[] = {4,40,18,60,70,80,90,12,10,20};

        executarfuncionalidades(vetorA, vetorB);
        
    }
    public static void executarfuncionalidades(int vetorA[], int vetorB[]) {
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {   
            System.out.print(vetorB[i] + " ");
        }

        //somar elemento do vetor A com o elemento do vetor B , de todos das mesmas posiçoes

        System.out.println("\nVetores somados: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + vetorB[i] + " ");
        }

        //multiplicar os elementos do vetor A com os elementos do vetor B, de todos das mesmas posiçoes

        System.out.println("\nVetores multiplicados: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] * vetorB[i] + " ");
        }

        // todos os elementos de A q nao existem em B

        System.out.println("\nElementos de A q nao existem em B: ");    
        for (int i = 0; i < vetorA.length; i++) {
            boolean existe = false;
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.print(vetorA[i] + " ");
            }
        }

        //mostrar elementos que aparecem nos dois vetores

        System.out.println("\nElementos que aparecem nos dois vetores: ");
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    System.out.print(vetorA[i] + " ");
                    break;
                }
            }
        }

        //realizar uniao dos elementos vetorA e os elementos do vetorB q nao existem em A

        System.out.println("\nUniao dos elementos vetorA e os elementos do vetorB q nao existem em A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            boolean existe = false;
            for (int j = 0; j < vetorA.length; j++) {
                if (vetorB[i] == vetorA[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.print(vetorB[i] + " ");
            }
        }



  

       


    }


    }


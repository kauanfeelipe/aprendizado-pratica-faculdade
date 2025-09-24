public class VetorInicio{
    public static void main(String[] args) {
        int c[] = {8,2,1,6,9};

        System.out.println("Elemento na posição 0: " +c[0]);

        System.out.println("Elemento na ultima posição : " +c[4]);

        System.out.println("Tamanho do vetor: " +c.length);

        // outra forma de mostrar o ultimo elemento

        System.out.println("Elemento na ultima posição (outra forma): " +c[c.length-1]);

        //mostar todos os elementos do vetor com uso do for

        for(int i =0;i <= 4; i++){
            System.out.println("Valor do vetor: " + c[i]);

        }

        //usar o for com o length

        for(int i =0;i < c.length; i++){
            System.out.println("Valor do vetor (com length): " + c[i]);

        }

        // mostrar caprichado

        for(int i =0;i < c.length; i++){
            System.out.println("c["+i+"]: "+c[i]);
        }

        // mostrar o vetor em oredem inversa

        for(int i = c.length-1;i >= 0; i--){
            System.out.println("c["+i+"]: "+c[i]);
        }

        //trocar o primeiro elemento do vetor com o ultimo elemento do vetor

        int troca;
        troca = c[0];
        c[0] = c[4];
        c[4] = troca;


        System.out.println("Vetor apos a troca");
        for(int i =0;i < c.length; i++){
            System.out.println("c["+i+"]: "+c[i]);
        }

        //calcular e mostrar a soma dos elementos do vetor

        int soma = 0;
        for(int i =0;i < c.length; i++){
            soma = soma + c[i];
        }

        System.out.println("Soma dos elementos do vetor: "+soma);


        //calcular e mostrar a multiplicação dos elementos do vetor

        int mult = 1;
        for(int i =0;i < c.length; i++){
            mult = mult * c[i];
        }

        System.out.println("Multiplicação dos elementos do vetor: "+mult);


        // encontrar e mostrar o maior elemento do vetor

        int maior = c[0];
        for(int i =1;i < c.length; i++){
            if(maior < c[i]){
                maior = c[i];
            }
        }

        System.out.println("Maior elemento do vetor: "+maior);

        // encontrar e mostrar o menor elemento do vetor

        int menor = c[0];
        for(int i =1;i < c.length; i++){
            if(menor > c[i]){
                menor = c[i];
            }
        }
        System.out.println("Menor elemento do vetor: "+menor);


        // mostrar a posicao do menor elemento do vetor
        
        int posicao;
        int menorValor = c[0];
        posicao = 0;
        for(int i =1;i < c.length; i++){
            if(menorValor > c[i]){
                menorValor = c[i];
                posicao = i;
            }
        }
        
        System.out.println("Posição do menor elemento do vetor: "+posicao);


        //calcular e mostrar a quantidade de numeros pares e impares do vetor

        int par = 0;
        int impar = 0;
        for(int i =0;i < c.length; i++){
            if(c[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println("Quantidade de numeros pares: "+par);
        System.out.println("Quantidade de numeros impares: "+impar);

}
}

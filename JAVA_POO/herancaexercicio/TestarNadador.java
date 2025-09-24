public class TestarNadador {
    public static void main(String[] args) {
        Nadador n1 = new Nadador(70, "Kauan", 25, 123, 89, 840);

        System.out.println("Nome: " + n1.getNome());
        System.out.println("Idade: " + n1.getIdade());
        System.out.println("Peso: " + n1.getPeso());
        System.out.println("Tempo1: " + n1.getTempos(0));
        System.out.println("Tempo2: " + n1.getTempos(1));
        System.out.println("Tempo3: " + n1.getTempos(2));
        System.out.println("Tempo medio: " + n1.calcularTempoMedia());
    }
}
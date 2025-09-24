public class TestaDesempenhoAluno {
    public static void main(String args[]){
        DesempenhoAluno d1 = new DesempenhoAluno();
        DesempenhoAluno d2 = new DesempenhoAluno();
        Produto p = new Produto();

        d1.setRgm(321);
        d1.setNomeDisciplina("DB");
        d1.setNotaA1(2.5);
        d1.setNotaA2(3.5);
        d1.setFrequencia(75);

        d2.setRgm(123);
        d2.setNomeDisciplina("POO");
        d2.setNotaA1(4);
        d2.setNotaA2(5);
        d2.setFrequencia(70);


        System.out.println("hello world");
















//        System.out.println("Dados do desempenho 1");
//        System.out.println("RGM: " + d1.getRgm());
//        System.out.println("Nome disciplina: " + d1.getNomeDisciplina());
//        System.out.println("Nota A1: " + d1.getNotaA1());
//        System.out.println("Nota A2: " + d1.getNotaA2());
//        System.out.println("Média: " + d1.calcularMedia());
//        System.out.println("Frequência: " + d1.getFrequencia());
//        System.out.println(d1.verficarAprovacao());
//        System.out.println("--------------------------------------");
//        System.out.println("Dados do desempenho 2");
//        System.out.println("RGM: " + d2.getRgm());
//        System.out.println("Nome disciplina: " + d2.getNomeDisciplina());
//        System.out.println("Nota A1: " + d2.getNotaA1());
//        System.out.println("Nota A2: " + d2.getNotaA2());
//        System.out.println("Média: " + d2.calcularMedia());
//        System.out.println("Frequência: " + d2.getFrequencia());
//        System.out.println(d2.verficarAprovacao());
    }
}
public class TestaPassagemAerea {
    public static void main(String[] args) {
        PassagemAerea p1 = new PassagemAerea("1234", "Gol", "Economica", 800);
        PassagemAerea p2 = new PassagemAerea("5678", "Azul", "Primeira Classe", 1200);

        p1.MostrarDetalhesPassagemAerea();
        
        p2.MostrarDetalhesPassagemAerea();
}
}
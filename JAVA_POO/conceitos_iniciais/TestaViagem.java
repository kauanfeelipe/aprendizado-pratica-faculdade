public class TestaViagem{
    public static void main(String[] args) {
        Viagem v1 = new Viagem("Franca", "Manaus", 1200, 20);
        Viagem v2 = new Viagem();
        Viagem v3 = new Viagem("Nuporanga", "Rio de Janeiro");
        // Viagem v1 = new Viagem();
        v1.MostrarDetalhes();
}
}
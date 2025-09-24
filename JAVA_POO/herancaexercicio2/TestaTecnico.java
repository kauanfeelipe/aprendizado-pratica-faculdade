public class TestaTecnico {
    public static void main(String[] args) {

        TecnicoInformatica ti = new TecnicoInformatica("Joao", 4800.00, "Informatica");
        ti.adicionarLinguagens("Java");
        ti.adicionarLinguagens("Python");
        ti.adicionarLinguagens("Ruby");
        ti.adicionarLinguagens("JavaScript");
        ti.adicionarLinguagens("C#");
        ti.mostrarDados();
    }
}
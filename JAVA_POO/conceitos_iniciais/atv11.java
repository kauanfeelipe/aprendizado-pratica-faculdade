public class Funcionario {
    private String nome;
    private double salarioBase;
    private double horasExTras;
    private double valorHoraExtra;
    private int faltas;
    private double valorDescontoFaltas;
    private int numeroDependentes;
    private double valorPorDependente;
    private int anuenio;
    private int anosTrabalhados;
    private double descontos;
    private double salarioLiquido;  

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase; 
    }
    public double getHorasExTras() {
        return horasExTras;
    }           
    public void setHorasExTras(double horasExTras) {    
        this.horasExTras = horasExTras;
    }
    public double getValorHoraExtra() { 
        return valorHoraExtra;
    }
    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) { 
        this.faltas = faltas;
    }   
    public double getValorDescontoFaltas() {    
        return valorDescontoFaltas;
    }   
    public void setValorDescontoFaltas(double valorDescontoFaltas) {    
        this.valorDescontoFaltas = valorDescontoFaltas; 
    }
    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
    public double getValorPorDependente() {
        return valorPorDependente;
    }
    public void setValorPorDependente(double valorPorDependente) {
        this.valorPorDependente = valorPorDependente;       
    }
    public int getAnuenio() {
        return anuenio; 
    }
    public void setAnuenio(int anuenio) {
        this.anuenio = anuenio;
    }
    public int getAnosTrabalhados() {
        return anosTrabalhados;
    }
    public void setAnosTrabalhados(int anosTrabalhados) {
        this.anosTrabalhados = anosTrabalhados;
    }
    public double getDescontos() {  
        return descontos;
    }  
    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }
    public void calcularAnuenio() {
        double valorAnuenio = salarioBase * (anuenio * anosTrabalhados);
        descontos += valorAnuenio;
    }

    public void calcularBonusTempoEmpresa() {
        if (anosTrabalhados > 10) {
            double bonusTempoEmpresa = salarioBase * 0.05;
            descontos -= bonusTempoEmpresa; 
        }
    }

    public void calcularValorHorasExtras() {
        double valorHorasExtras = horasExTras * valorHoraExtra;
        descontos -= valorHorasExtras; 
    }

    public void calcularDescontoFaltas() {
        valorDescontoFaltas = faltas * (faltas >= 5 ? 1.5 : 1.0);
        descontos += valorDescontoFaltas;
    }

    public void calcularBeneficioDependentes() {
        double valorBeneficioDependentes = numeroDependentes * valorPorDependente;
        descontos -= valorBeneficioDependentes; 
    }

    public void calcularImposto() {
        double imposto = 0;
        if (salarioBase >= 2500 && salarioBase <= 5000) {
            imposto = salarioBase * 0.10;
        } else if (salarioBase > 5000) {
            imposto = salarioBase * 0.15;
        }
        descontos += imposto;
    }

    public void calcularSalarioLiquido() {
        salarioLiquido = salarioBase - descontos;
    }
    public void mostrarFolhaPagamento() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Extras: " + horasExTras);
        System.out.println("Valor Hora Extra: " + valorHoraExtra);
        System.out.println("Faltas: " + faltas);
        System.out.println("Valor Desconto Faltas: " + valorDescontoFaltas);
        System.out.println("Numero Dependentes: " + numeroDependentes);
        System.out.println("Valor Por Dependente: " + valorPorDependente);
        System.out.println("Anuenio: " + anuenio);
        System.out.println("Anos Trabalhados: " + anosTrabalhados);
        System.out.println("Descontos: " + descontos);
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
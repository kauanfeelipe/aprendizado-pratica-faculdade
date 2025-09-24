public class Funcionario {
    private Sting nome;
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
    
    public void calcularAnuenio(double salarioBase, int anuenio, int anosTrabalhados){ {
        double valorAnuenio = salarioBase * (anuenio * anosTrabalhados);
        return valorAnuenio;
    }
    }
    public void calcularBonusTempoEmpresa(double salarioBase, int anosTrabalhados) {
        double bonusTempoEmpresa = salarioBase * 0.05;
        if (anosTrabalhados > 10) {
            descontos = descontos + bonusTempoEmpresa;
        }
        return bonusTempoEmpresa;    
    }
    public void calcularValorHorasExtras(double salarioBase, double horasExTras, double valorHoraExtra) {
        double valorHorasExtras = 0;
        if (horasExTras > 3) {
            valorHorasExtras = (horasExTras * valorHoraExtra) * 0.5;
        } else {
            valorHorasExtras = horasExTras * valorHoraExtra;
        }
        descontos = descontos + valorHorasExtras;
        return valorHorasExtras;     
    }
    public void  calcularDescontoFaltas(double salarioBase, int faltas) {
        double valorDescontoFaltas = 0;
        if (faltas >= 5) {
            valorDescontoFaltas = faltas * 1.5;
        } else {
            valorDescontoFaltas = faltas;
        }
        descontos = descontos + valorDescontoFaltas;
        return valorDescontoFaltas;
    }

    public void calcularBeneficioDependentes(double salarioBase, int numeroDependentes) {
        double valorBeneficioDependentes = valorBeneficioDependentes - numeroDependentes * valorPorDependente;
        descontos = descontos + valorBeneficioDependentes;
        return valorBeneficioDependentes;
    }

    public void calcularImposto(double salarioBase) {
        double imposto = 0;
        if (salarioBase >= 2500 && salarioBase <= 5000) {
            imposto = salarioBase * 0.10;
        } else if (salarioBase > 5000) {
            imposto = salarioBase * 0.15;
        }
        descontos = descontos + imposto;
        return imposto;
    }
    public void calcularSalarioLiquido(double salarioBase) {
        double salarioLiquido = salarioBase - descontos;
        return salarioLiquido;
    }
//metodo mostrarfolhadepagaento , deve mostrar detalhadamente as informaçoes do slario do funcionario,incluido acrescimos e descontos

    public void mostrarFolhaPagamento() {
        System.out.println("Nome: " + nome); 
        System.out.println("Salario Base: " + salarioBase); 
        System.out.println("Horas Extras: " + horasExTras); 
        System.out.println("Valor Hora Extra: " + valorHoraExtra); 
        System.out.println("Faltas: " + faltas); 
        System.out.println("Valor Desconto Faltas: " + valorDescontoFaltas); 
        System.out.println("Numero Dependentes: " + numeroDependentes); 
        System.out.println("Valor Por Dependente: " + valorPorDependente); 
        System.out.println("Ano de Nascimento: " + anuenio); 
        System.out.println("Anos Trabalhados: " + anosTrabalhados); 
        System.out.println("Descontos: " + descontos); 
        System.out.println("Salario Liquido: " + salarioLiquido); 
    }

}

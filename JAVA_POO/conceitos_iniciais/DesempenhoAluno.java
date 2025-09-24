public class DesempenhoAluno {

    private int rgm;
    private String nomeDisciplina;
    private double notaA1;
    private double notaA2;
    private double frequencia;
    private double calculaMedia;
    private String verificarAprovacao;

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int r) {
        rgm = r;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String n) {
        nomeDisciplina = n;
    }

    public double getNotaA1() {
        return notaA1;
    }

    public void setNotaA1(double a) {
        if (a < 0 || 5 < a) {
            notaA1 = 0;
        } else {
            notaA1 = a;
        }
    }

    public double getNotaA2() {
        return notaA2;
    }

    public void setNotaA2(double a) {
        if (a < 0 || 5 < a) {
            notaA2 = 0;
        } else {
            notaA2 = a;
        }
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double f) {
        if (f < 0 || 100 < f) {
            frequencia = 0;
        } else {
            frequencia = f;
        }
    }

    public double calcularMedia() {
        double media;
        media = notaA1 + notaA2;
        return media;
    }

    public String verficarAprovacao() {
        //Para um aluno ser aprovado, precisa
        //ter média >=6 e frequência >=75
        double media;
        media = calcularMedia();
        if (media >= 6 && frequencia >= 75) {
            return "Aluno Aprovado!";
        } else if (media < 6 && frequencia >= 75) {
            return "Reprovado por média.";
        } else if (media >= 6 && frequencia < 75) {
            return "Reprovado por frequência.";
        } else {
            return "Reprovado por média e frequência.";
        }
    }

}
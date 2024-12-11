package br.com.alura.scremmath.modelos.scremmath.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvalaicaes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacaos() {
        return totalDeAvaliacoes;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.scremmath.modelos.scremmath.modelos.Filme:  " + nome);
        System.out.println("Ano de lancamento:  " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvalaicaes+= nota;
    }
    public double pegaMedia(){
        return somaDasAvalaicaes / totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos() {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

package br.com.alura.scremmath.modelos.scremmath.modelos;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

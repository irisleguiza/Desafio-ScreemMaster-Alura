import br.com.alura.scremmath.modelos.scremmath.modelos.*;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1980);
        //meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia( 10);
       // System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacaos());
        //System.out.println( meuFilme.pegaMedia());

    Serie serie = new Serie();
    serie.setNome("Lost");
    serie.setAnoDeLancamento(2000);
    serie.setTemporadas(19);
    serie.setEpisodiosPorTemporada(10);
    System.out.println("Duracac para maratonear serie: " + serie.getDuracaoEmMinutos());

    Filme outroFilme = new Filme();
    outroFilme.setNome("Avatar");
    outroFilme.setAnoDeLancamento(2023);
    //outroFilme.setDuracaoEmMinutos(200);


        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro =new FiltroRecomendacao();
        filtro.filtro(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtro(episodio);

    }
}

import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade() {
        int musicaComMaiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidade > musicaComMaiorPopularidade){
                musicaComMaiorPopularidade = musicas.get(i).popularidade;
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorduracao() {
        int musicaComMenorDuracao = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).duracaoSegundos > musicaComMenorDuracao) {
                musicaComMenorDuracao = musicas.get(i).duracaoSegundos;
                index = i;
            }
        }
        return musicas.get(index);
    }
}

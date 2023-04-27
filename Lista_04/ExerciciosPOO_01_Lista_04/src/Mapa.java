import java.util.ArrayList;

public class Mapa {
    private  String mapa;
    private int altura;
    private int largura;

    private ArrayList<Inimigo>inimigos = new ArrayList<>();
    private  ArrayList<Heroi>herois = new ArrayList<>();

    public Mapa (){}

    public Mapa (String mapa, int altura, int largura, ArrayList<Inimigo>inimigos, ArrayList<Heroi>herois){
        this.mapa = mapa;
        this.altura = altura;
        this.largura = largura;
        this.inimigos = inimigos;
        this.herois = herois;
    }
    public String getMapa(){
        return this.mapa = mapa;
    }
    public void setMapa(){
        this.mapa = mapa;
    }
    public int altura(){
        return this.altura = altura;
    }
    public void setAltura(){
        this.altura = altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public void setLargura(){
        this.largura = largura;
    }
    public ArrayList<Inimigo> getInimigos(){
        return this.inimigos = inimigos;
    }
    public void setInimigos(){
        this.inimigos = inimigos;
    }
    public ArrayList<Heroi> getHerois(){
        return this.herois = herois;
    }
    public void setHerois(){
        ArrayList <Heroi> heroiArrayLis = this.herois;
    }

    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaqueInimigo = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if(inimigos.get(i).getAtaque() > maiorAtaqueInimigo) {
                maiorAtaqueInimigo = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }
}


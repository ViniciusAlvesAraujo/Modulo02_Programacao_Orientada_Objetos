import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi>herois = new ArrayList<>();

    private int totalMoedasDeOuro;

    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroi (Heroi heroi){
        for (int i = 0; i < herois.size(); i++){
            if(herois.get(i).getId() == heroi.getId()){
                System.out.println("O heroi " + herois.get(i).getNome() + " já está no grupo");
                return;
            }
        }
        herois.add(heroi);
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("O Heroi " + heroi.getNome() + " foi adicionado ao grupo");

    }

    public void removerHeroi (int idHeroi){
        for (int i = 0; i < herois.size(); i++){
            if(herois.get(i).getId() == idHeroi){
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(i).getQuantidadeDeMoedasDeOuro();
                System.out.println("O heroi " + herois.get(i).getNome() + " foi removido do grupo");
                herois.remove(i);
            }
        }
    }

    public ArrayList<Heroi> getHerois(){
        return this.herois;
    }
    public void setHerois(){
        this.herois = herois;
    }
    public int getTotalMoedasDeOuro(){
        return this.totalMoedasDeOuro;
    }
    public void setTotalMoedasDeOuro(int totalMoedasDeOuro){
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}

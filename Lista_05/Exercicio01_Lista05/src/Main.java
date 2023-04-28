public class Main {
    public static void main(String[] args) {

        Heroi panteraNegra = new Heroi(1,"Pantera Negra", 10);
        Heroi thor = new Heroi (2, "Thor", 10);
        Heroi homemDeFerro = new Heroi (3, "Homem de Ferro", 10);
        Heroi capitaoAmerica = new Heroi(3, "Capitão America", 10);

        Grupo herois = new Grupo();

        herois.adicionarHeroi(panteraNegra);
        herois.adicionarHeroi(thor);
        herois.adicionarHeroi(homemDeFerro);
        herois.adicionarHeroi(capitaoAmerica);

        herois.removerHeroi(3);

        System.out.println("O total de de moedas é: " + herois.getTotalMoedasDeOuro());

    }
}
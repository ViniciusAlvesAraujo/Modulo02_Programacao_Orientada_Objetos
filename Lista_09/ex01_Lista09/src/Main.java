public class Main {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("1a1a1a", "Bulbasaur", "plantas"));
        pokedex.adicionarPokemon(new Pokemon("2b2b2b", "Charmander", "fogo"));
        pokedex.adicionarPokemon(new Pokemon("3c3c3c", "Squirtle", "água"));
    }
}
package _12_DefiningClassesExercise._6_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void checkIfPokemonExistsByElement(String element) {

        boolean isAtLeastOneExists = false;

        for(Pokemon pokemon : this.pokemons){
            if (pokemon.getElement().equals(element)){
                isAtLeastOneExists = true;
                break;
            }
        }

        if (isAtLeastOneExists){
            badges++;
        }else {
            for (Pokemon pokemon : this.pokemons) {
                pokemon.loseHealth();
            }

            this.pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
        }
    }

    public int getBadges() {
        return badges;
    }

    public String toString(){

        return String.format("%s %d %d",this.name,this.getBadges(),this.pokemons.size());
    }
}

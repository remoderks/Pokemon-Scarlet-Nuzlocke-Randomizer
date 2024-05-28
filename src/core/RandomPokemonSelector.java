package core;

import java.util.*;
import core.PokemonDataScarlet;

public class RandomPokemonSelector {

    public static void main(String[] args) {

        // Print a random Pokémon for each unique list
        Random random = new Random();
        System.out.println("Random Pokémon from each route:");
        for (Map.Entry<String, List<Pokemon>> entry : PokemonDataScarlet.getData().entrySet()) {
            String route = entry.getKey();
            List<Pokemon> pokemonList = entry.getValue();
            Pokemon randomPokemon = pokemonList.get(random.nextInt(pokemonList.size()));
            System.out.println(route + ": " + randomPokemon.getName() + " (Level " + randomPokemon.getMinLevel() + "-" + randomPokemon.getMaxLevel() + ")");
        }
    }
}

class Pokemon {
    private String name;
    private int minLevel;
    private int maxLevel;

    public Pokemon(String name, int minLevel, int maxLevel) {
        this.name = name;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}

package game;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.simple.parser.ParseException;

import cards.Deck;
import pokemon.Pokemon;
import pokemon.StarterPokemon;

public class Tester {
	
	public static void main(String args[]) throws FileNotFoundException, ParseException, InstantiationException, IllegalAccessException{
		Deck<StarterPokemon> d = new Deck(new File("src/files/starter_pokemon.json"), StarterPokemon.class);
		Deck<StarterPokemon> p = new Deck(new File("src/files/pink_pokemon.json"), Pokemon.class);
		Deck<StarterPokemon> g = new Deck(new File("src/files/green_pokemon.json"), Pokemon.class);
		Deck<StarterPokemon> b = new Deck(new File("src/files/blue_pokemon.json"), Pokemon.class);
		Deck<StarterPokemon> r = new Deck(new File("src/files/red_pokemon.json"), Pokemon.class);
		Deck<StarterPokemon> y = new Deck(new File("src/files/yellow_pokemon.json"), Pokemon.class);
		
	}

}

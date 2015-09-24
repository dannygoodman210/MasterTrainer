package game;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.simple.parser.ParseException;

import cards.Deck;
import cards.EventCard;
import cards.ItemCard;
import pokemon.Pokemon;
import pokemon.StarterPokemon;

public class Tester {
	
	public static void main(String args[]) throws FileNotFoundException, ParseException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		Deck<StarterPokemon> s = new Deck<StarterPokemon>(new File("src/files/starter_pokemon.json"));
		Deck<Pokemon> p = new Deck<Pokemon>(new File("src/files/pink_pokemon.json"));
		Deck<Pokemon> g = new Deck<Pokemon>(new File("src/files/green_pokemon.json"));
		Deck<Pokemon> b = new Deck<Pokemon>(new File("src/files/blue_pokemon.json"));
		Deck<Pokemon> r = new Deck<Pokemon>(new File("src/files/red_pokemon.json"));
		Deck<Pokemon> y = new Deck<Pokemon>(new File("src/files/yellow_pokemon.json"));
		Deck<ItemCard> i = new Deck<ItemCard>(new File("src/files/item_cards.json"));
		Deck<EventCard> e = new Deck<EventCard>(new File("src/files/event_cards.json"));
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(e);
		
		Game game = new Game(6);
		game.initialize();
		
	}

}

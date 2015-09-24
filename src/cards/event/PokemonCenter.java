package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class PokemonCenter extends EventCard {
	
	public void build(JSONObject obj){
		myName = "Pokemon Center";
		myDescription = "Revive any one of your knocked-out Pokemon.";
	}

	@Override
	public void doAction(Game g) {
		g.revivePickPokemon();
	}

}

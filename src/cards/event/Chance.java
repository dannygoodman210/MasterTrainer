package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class Chance extends EventCard {
	
	public void build(JSONObject obj){
		myName = "Chance";
		myDescription = "Choose one Pokemon of the color you landed on";
	}

	@Override
	public void doAction(Game g) {
		g.catchPickPokemon(0);
	}

}

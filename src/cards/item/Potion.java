package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class Potion extends ItemCard {
	
	public void build(JSONObject obj){
		myName = "Potion";
		myDescription = "Use to revive one of your knocked-out Pokemon, then continue your turn.";
	}
	
	@Override
	public void doAction(Game g) {
		g.revivePickPokemon();
	}

}

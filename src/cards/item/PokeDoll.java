package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class PokeDoll extends ItemCard {
	
	public void build(JSONObject obj){
		myName = "PokeDoll";
		myDescription = "Use to stop another player from battling or trading with you.";
	}
	
	
	@Override
	public void doAction(Game g) {
		g.activatePokeDoll();
	}

}

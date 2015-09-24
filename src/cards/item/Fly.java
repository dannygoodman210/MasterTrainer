package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class Fly extends ItemCard {
	
	public void build(JSONObject obj){
		myName = "Fly";
		myDescription = "On your turn, you may fly to a city or town instead of rolling the die.";
	}
	@Override
	public void doAction(Game g) {
		g.fly();
	}

}

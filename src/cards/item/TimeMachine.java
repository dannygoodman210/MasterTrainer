package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class TimeMachine extends ItemCard {
	
	public void build(JSONObject obj){
		myName = "Time Machine";
		myDescription = "Play this card to re-roll one roll of the die.";
	}
	
	@Override
	public void doAction(Game g) {
		g.setReroll(g.rollDie());

	}

}

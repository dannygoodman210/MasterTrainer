package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class Attack extends EventCard {
	
	public void build(JSONObject obj){
		myName = "Attack";
		myDescription = "Fight a trainer battle with any other player.";
	}

	@Override
	public void doAction(Game g) {
		// TODO Auto-generated method stub
		g.attackEvent();
	}

}

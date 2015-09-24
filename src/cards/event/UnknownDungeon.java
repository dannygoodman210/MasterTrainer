package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class UnknownDungeon extends EventCard {
	
	@Override
	public void build(JSONObject obj){
		myName = "Unknown Dungeon Pokemon";
		myDescription = "Choose one Yellow Pokemon. Roll to Cacth 'Em";
	}

	@Override
	public void doAction(Game g) {
		g.unknownDungeon();
	}

}

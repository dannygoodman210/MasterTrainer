package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class Trade extends EventCard {

	@Override
	public void build(JSONObject obj){
		myName = "Trade";
		myDescription = "Trade a Pokemon with anoher player.";
	}

	@Override
	public void doAction(Game g) {
		g.tradeEvent();
	}

}

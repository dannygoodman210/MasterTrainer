package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class PokeBall extends ItemCard {

	@Override
	public void build(JSONObject obj) {
		myName = obj.get("name").toString();
		myDescription = "Before rolling to catch a Pokemon, play this to add "
				+ obj.get("Description").toString() + " your roll.";
	}

	@Override
	public void doAction(Game g) {
		g.activatePokeBall(myName);
	}

}

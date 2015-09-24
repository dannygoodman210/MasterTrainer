package cards.item;

import org.json.simple.JSONObject;

import cards.ItemCard;
import game.Game;

public class AttackBonus extends ItemCard {
	
	public int myValue;
	
	@Override
	public void build(JSONObject obj){
		myValue = Integer.parseInt(obj.get("value").toString());
		myName = "Attack Bonus +" + myValue;
		myDescription = "Add " + myValue + " to your Pokemon Attack Strength.";
	}

	@Override
	public void doAction(Game g) {
		g.addAttackBonus(myValue);
	}
}

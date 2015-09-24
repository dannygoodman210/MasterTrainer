package cards.event;

import org.json.simple.JSONObject;

import cards.EventCard;
import game.Game;

public class TakeItem extends EventCard {
	
	private int myDraw;

	@Override
	public void build(JSONObject obj) {
		myDraw = Integer.parseInt(obj.get("draw").toString());
		if(myDraw == 1){
		myDescription = "Draw " + myDraw + " Item Card";
		myName = "Take " + myDraw + " Item Card";
		}
		else{
			myDescription = "Draw " + myDraw + " Item Cards";
			myName = "Take " + myDraw + " Item Cards";
		}
	}

	@Override
	public void doAction(Game g) {
		g.DrawItemCard(myDraw);
	}

}

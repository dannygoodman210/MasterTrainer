package cards;
import java.util.Collection;

import game.Game;

public abstract class Card {
	
	protected String myName;
	protected String myDescription;
	
	public Card(String name, String Description){
		
	}
	
	public abstract void doAction(Game g);
	
	public String getName(){
		return myName;
	}
	
	public String getDescription(){
		return myDescription;
	}

}

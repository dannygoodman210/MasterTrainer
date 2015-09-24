package cards;
import java.util.Collection;

import org.json.simple.JSONObject;

import game.Buildable;
import game.Game;

public abstract class Card implements Buildable {
	
	protected String myName;
	protected String myDescription;
	
	protected void AssignValues(String name, String description){
		myName = name;
		myDescription = description;
		
	}
	
	public void build(JSONObject obj){
		//Do Nothing
	}
	
	public abstract void doAction(Game g);
	
	public String getName(){
		return myName;
	}
	
	public String getDescription(){
		return myDescription;
	}
	
	@Override
	public String toString(){
		return myName;
	}

}

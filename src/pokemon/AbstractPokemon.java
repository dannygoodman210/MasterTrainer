package pokemon;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import cards.Buildable;

public abstract class AbstractPokemon implements Buildable {
	
	protected String myName;
	protected int myNumber;
	protected int myPowerPoints;
	protected int myAttackPoints;
	protected int myType;
	protected List<Integer> myDiceRolls;
	protected String myImageFilename;

	protected void AssignValues(String name, int type, int number, int powerPoints, int attackPoints, List<Integer> diceRolls){
		myName = name;
		myType = type;
		myNumber = number;
		myPowerPoints = powerPoints;
		myAttackPoints = attackPoints;
		myDiceRolls = diceRolls;
		String editName = editName(name);
		myImageFilename = "src/images/pokemon/"+number+"_"+editName+".png";
	}

	protected String editName(String name) {
		String editName = name.toLowerCase();
		return editName;
	}
	
	@Override
	public void build(JSONObject obj) {
		int type = Integer.valueOf(obj.get("type").toString());
		List<Integer> list = createDiceRolls(type);
		AssignValues(obj.get("name").toString(),type,
				Integer.valueOf(obj.get("number").toString()),
				Integer.valueOf(obj.get("pp").toString()),
				Integer.valueOf(obj.get("ap").toString()),list);
	}
	
	@Override
	public String toString() {
		String dr = "";
		if(myDiceRolls.isEmpty()){
			dr = "N/A";
		}
		else {
			dr = "" + myDiceRolls.get(0);
			for(int i= 1; i < myDiceRolls.size(); i++){
				dr = dr + ", " + myDiceRolls.get(i);
			}
		}
		return myName + " #" + myNumber + " : PP = " + myPowerPoints + ", AP = " + myAttackPoints + ", DR = " + dr + " " + myImageFilename;
		
	}
	
	protected abstract List<Integer> createDiceRolls(int type);

	public String getName(){
		return myName;
	}
	
	public int getType(){
		/* 0 = Starter
		 * 1 = Pink
		 * 2 = Green
		 * 3 = Blue
		 * 4 = Red 
		 * 5 = Yellow
		 */
		return myType;
	}
	
	public int getNumber(){
		return myNumber;
	}
	
	public int getPowerPoints(){
		return myPowerPoints;
	}

	public int getAttackPoints(){
		return myAttackPoints;
	}
	
	public List<Integer> getDiceRolls(){
		return myDiceRolls;
		
	
	}


}


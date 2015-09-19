package pokemon;

import java.util.List;

public abstract class AbstractPokemon {
	
	protected String myName;
	protected int myNumber;
	protected int myPowerPoints;
	protected int myAttackPoints;
	protected int myType;
	protected List<Integer> myDiceRolls;

	public AbstractPokemon(String name, int type, int number, int powerPoints, int attackPoints, List<Integer> diceRolls){
		myName = name;
		myType = type;
		myNumber = number;
		myPowerPoints = powerPoints;
		myAttackPoints = attackPoints;
		myDiceRolls = diceRolls;
	}
	
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


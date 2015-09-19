package board;

import java.util.List;

import game.Game;

public abstract class Space {
	
	private List<Integer> myNeighbors;
	private int myNumber;
	protected int myType;
	
	public Space(int number, int type, List<Integer> neighbors){
		myNeighbors = neighbors;
		myType = type;
		myNumber = number;
	}
	
	public int getNumber(){
		return myNumber;
	}
	
	public List<Integer> getNeighbors(){
		return myNeighbors;
	}
	
	public int getType(){
		/* 0 = City
		 * 1 = Pink
		 * 2 = Green
		 * 3 = Blue
		 * 4 = Red
		 * 5 = Indigo
		 */
		return myType;
	}
	
	public abstract void doAction(Game g);

}

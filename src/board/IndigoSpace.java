package board;

import java.util.List;

import game.Game;

public class IndigoSpace extends Space {

	private int myIndigoType;

	public IndigoSpace(int number, int type, int indigoType, List<Integer> neighbors) {
		super(number, type, neighbors);
		myIndigoType = indigoType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(Game g) {
		switch (myIndigoType){
		case 1: 
			g.catchPickPokemon(myType);
			break;
		case 2:
			g.drawEventCard();
			break;
		case 3: case 4: case 5:
			g.DrawItemCard(myIndigoType - 2);
			break;
		case 6:
			g.finalBattle();
			break;
		}

	}
	
	public int getIndigoType(){
		/* 0 = start
		 * 1 = catch pokemon
		 * 2 = event
		 * 3 = Draw 1
		 * 4 = Draw 2
		 * 5 = Draw 3
		 * 5 = Final Battle
		 */
		return myIndigoType;
	}

}

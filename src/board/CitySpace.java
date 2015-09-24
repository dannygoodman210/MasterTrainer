package board;

import java.util.List;

import game.Game;

public class CitySpace extends Space{

	private String myName;
	private int myDraw = 2;

	public CitySpace(String name, int number, int type, List<Integer> neighbors) {
		super(number, type, neighbors);
		myName = name;
	}

	@Override
	public void doAction(Game g) {
		g.DrawItemCard(myDraw);
	}

}

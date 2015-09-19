package board;

import java.util.List;

import game.Game;

public class ReviveCitySpace extends CitySpace {

	public ReviveCitySpace(String name, int number, int type, List<Integer> neighbors) {
		super(name, number, type, neighbors);
	}
	
	@Override
	public void doAction(Game g){
		g.reviveCitySpace();
	}

}

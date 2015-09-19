package board;

import java.util.List;

import game.Game;

public class EventSpace extends Space {

	public EventSpace(int number, int type, List<Integer> neighbors) {
		super(number, type, neighbors);
	}

	@Override
	public void doAction(Game g) {
		g.drawEventCard();
	}

}

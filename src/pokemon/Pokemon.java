package pokemon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.simple.JSONObject;

import game.Tradeable;

public class Pokemon extends AbstractPokemon implements Tradeable {

	private boolean tradeSelect = false;
	
	@Override
	public void select() {
		tradeSelect = !tradeSelect;
	}

	@Override
	public String showDescription() {
		return "Power Points: " + myPowerPoints + "/nAttackPoints: " + myAttackPoints;
	}

	@Override
	public String showName() {
		return myName;
	}

	@Override
	public void Trade(Collection<Tradeable> from, Collection<Tradeable> to) {
		from.remove(this);
		to.add(this);
	}

	@Override
	protected List<Integer> createDiceRolls(int type) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		switch (type){
		case 1:
			list.add(3);
			list.add(4);
			list.add(5);
			break;
		case 2:
			list.add(4);
			list.add(5);
			break;
		case 3:
			list.add(3);
			list.add(4);
			break;
		case 4:
			list.add(5);
			break;
		case 5:
			list.add(6);
			break;
		}
		return list;
	}

}

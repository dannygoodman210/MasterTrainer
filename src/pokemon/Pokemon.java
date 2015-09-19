package pokemon;

import java.util.Collection;
import java.util.List;

import game.Tradeable;

public class Pokemon extends AbstractPokemon implements Tradeable {

	private boolean tradeSelect = false;
	
	public Pokemon(String name, int type, int number, int powerPoints, int attackPoints, List<Integer> diceRolls) {
		super(name, type, number, powerPoints, attackPoints, diceRolls);
	}

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

}

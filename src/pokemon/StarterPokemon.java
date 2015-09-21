package pokemon;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class StarterPokemon extends AbstractPokemon {

	@Override
	protected List<Integer> createDiceRolls(int type) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		return list;
	}

}

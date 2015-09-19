package board;

import java.util.List;

import game.Game;
import pokemon.AbstractPokemon;

public class PokemonSpace extends Space {
	
	private AbstractPokemon myPokemon;
	private boolean myPokemonVisible;

	public PokemonSpace(int number, int type, List<Integer> neighbors) {
		super(number, type, neighbors);
	}

	@Override
	public void doAction(Game g) {
		if(!myPokemonVisible)
			myPokemonVisible = true;
		if(g.catchPokemon(myPokemon)){
			myPokemon = g.replacePokemon();
		}
	}
	
	public boolean getPokemonVisible(){
		return myPokemonVisible;
	}
	
	public AbstractPokemon getPokemon(){
		return myPokemon;
	}
	
	

}

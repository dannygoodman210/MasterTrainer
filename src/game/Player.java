package game;

import java.util.List;

import cards.ItemCard;
import pokemon.AbstractPokemon;

public class Player {
	
	private String myName;
	private List<AbstractPokemon> myPokemon;
	private List<ItemCard> myItems;
	private int myCurrentRoll;
	
	public int rollDie(Game g) {
		setCurrentRoll(g.rollDie());
		return myCurrentRoll;
	}

	public int getCurrentRoll() {
		return myCurrentRoll;
	}

	public void setCurrentRoll(int myCurrentRoll) {
		this.myCurrentRoll = myCurrentRoll;
	}

	public List<ItemCard> getItems() {
		return myItems;
	}

	public void setItems(List<ItemCard> myItems) {
		this.myItems = myItems;
	}

	public List<AbstractPokemon> getPokemon() {
		return myPokemon;
	}

	public void setPokemon(List<AbstractPokemon> myPokemon) {
		this.myPokemon = myPokemon;
	}

	public String getName() {
		return myName;
	}

	public void setName(String myName) {
		this.myName = myName;
	}
	
	public String toString(){
		return "P" + myName;
	}

}

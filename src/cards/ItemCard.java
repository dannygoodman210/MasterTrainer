package cards;

import java.util.Collection;

import game.Tradeable;

public abstract class ItemCard extends Card implements Tradeable{
	
	private boolean tradeSelect = false;

	public ItemCard(String name, String Description) {
		super(name, Description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void select() {
		tradeSelect = !tradeSelect;
	}

	@Override
	public String showDescription() {
		// TODO Auto-generated method stub
		return myDescription;
	}

	@Override
	public String showName() {
		// TODO Auto-generated method stub
		return myName;
	}

	
	
	
}

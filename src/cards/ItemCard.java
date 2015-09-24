package cards;

import game.Tradeable;

public abstract class ItemCard extends Card implements Tradeable{
	
	private boolean tradeSelect = false;

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

package game;

import java.util.Collection;

public interface Tradeable {
	
	public void select();
	
	public String showDescription();
	
	public String showName();
	
	public default void Trade(Collection<Tradeable> from, Collection<Tradeable> to){
		from.remove(this);
		to.add(this);
	}

}

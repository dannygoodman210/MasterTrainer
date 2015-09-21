package cards;

import java.io.File;
import org.json.simple.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck{
	
	private List<Object> myDeck;
	
	public Deck(File f){
		//Parse Text File to create Deck.
		JSONObject j;
	}
	
	public void shuffle(){
		Collections.shuffle(myDeck);
	}

}

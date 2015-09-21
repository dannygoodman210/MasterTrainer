package cards;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Deck<T extends Buildable>{
	
	private List<Buildable> myDeck;
	private Class<T> myClass;
	
	public Deck(File f, Class<T> elementClass) throws FileNotFoundException, ParseException, InstantiationException, IllegalAccessException{
		myDeck = new ArrayList<Buildable>();
		myClass = elementClass;
		String data = new Scanner(f).useDelimiter("//A").next();
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(data);
		JSONObject obj;
		Buildable element;
		for(int i = 0; i < array.size(); i++){
			obj = (JSONObject) array.get(i);
			element = elementClass.newInstance();
			element.build(obj);
			myDeck.add(element);
		}
		System.out.println(myDeck);
	}
	
	public void shuffle(){
		Collections.shuffle(myDeck);
	}

}

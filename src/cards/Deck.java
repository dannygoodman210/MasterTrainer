package cards;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import game.Buildable;
import game.Builder;
import pokemon.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deck<T extends Buildable> implements Builder{
	
	private List<T> myDeck;
	
	@SuppressWarnings({ "resource", "unchecked" })
	public Deck(File f) throws FileNotFoundException, ParseException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		builder(f);
	}
	
	@Override
	public void builder(File f) throws FileNotFoundException, ParseException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		myDeck = new ArrayList<T>();
		String data = new Scanner(f).useDelimiter("//A").next();
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(data);
		JSONObject obj;
		T element;
		for(int i = 0; i < array.size(); i++){
			obj = (JSONObject) array.get(i);
			Class<T> buildClass = (Class<T>) Class.forName(obj.get("class").toString());
			element = buildClass.newInstance();
			element.build(obj);
			myDeck.add(element);
		}
	}
	
	public String toString(){
		return myDeck.toString();
	}
	
	public void shuffle(){
		Collections.shuffle(myDeck);
	}
	
	public T draw(){
		return myDeck.remove(0);
	}

}

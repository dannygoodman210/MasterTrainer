package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import org.json.simple.parser.ParseException;

import board.Space;
import cards.*;
import pokemon.*;

public class Game {
	
	private List<Player> myPlayers;
	private List<Player> playerOrder;
	private Deck<Buildable> sDeck;
	private Deck<Buildable> pDeck;
	private Deck<Buildable> gDeck;
	private Deck<Buildable> bDeck;
	private Deck<Buildable> rDeck;
	private Deck<Buildable> yDeck;
	private Deck<Buildable> itemDeck;
	private Deck<Buildable> eventDeck;
	private String activePokeball = "";
	private int activeAttackBonus = 0;
	private int activeReroll = 0;
	private boolean activePokeDoll = false;
	private List<Deck<Buildable>> allDecks;
	
	public Game(int players){
		myPlayers = new ArrayList<Player>();
		playerOrder = new ArrayList<Player>();
		allDecks = new ArrayList<Deck<Buildable>>();
		for(int i = 0; i < players; i++){
			Player p = new Player();
			int num = 1+i;
			p.setName(""+num);
			myPlayers.add(p);
		}
	}
	
	public void initialize() throws FileNotFoundException, InstantiationException, IllegalAccessException, ParseException, ClassNotFoundException{
		createDecks();
		shuffleDecks();
		playerOrder = rollPlayerOrder();
		System.out.println("Final Order: "+playerOrder);
	}
	
	private List<Player> rollPlayerOrder() {
		return getOrder(myPlayers, new ArrayList<Player>());
	}

	private List<Player> getOrder(List<Player> players, List<Player> order){
		List<Integer> rolls = new ArrayList<Integer>();
		for(int i = 0; i < players.size(); i++){
			rolls.add(players.get(i).rollDie(this));
		}
		rolls.set(0, 5);
		System.out.println(players);
		System.out.println(rolls);
		int max = Collections.max(rolls);
		List<Player> matchRolls = new ArrayList<Player>();
		while(max !=0){
			if(Collections.frequency(rolls, max) == 1){
				int index = rolls.indexOf(max);
				order.add(players.get(index));
				System.out.println("("+players.get(index)+")");
				rolls.set(index,0); 
				//System.out.println(rolls);
			}
			else{
				//System.out.println("{"+max+"}");
				for(int i = 0; i < rolls.size(); i++){
					if(rolls.get(i) == max){
						matchRolls.add(players.get(i));
						rolls.set(i, 0);
					}
				}
				//System.out.println(matchRolls);
			}
			if(!matchRolls.isEmpty()){
				order = (getOrder(matchRolls, order));
				matchRolls = new ArrayList<Player>();
			}
			max = Collections.max(rolls);
			//System.out.println(max);
		}
		//System.out.println("out");
		return order;
	}

	public int rollDie() {
		return (int)Math.ceil(Math.random()*6);
	}

	private void shuffleDecks() {
		for(Deck<Buildable> d : allDecks){
			d.shuffle();
		}
	}

	private void createDecks()
			throws FileNotFoundException, ParseException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		sDeck = new Deck<Buildable>(new File("src/files/starter_pokemon.json"));
		pDeck = new Deck<Buildable>(new File("src/files/pink_pokemon.json"));
		gDeck = new Deck<Buildable>(new File("src/files/green_pokemon.json"));
		bDeck = new Deck<Buildable>(new File("src/files/blue_pokemon.json"));
		rDeck = new Deck<Buildable>(new File("src/files/red_pokemon.json"));
		yDeck = new Deck<Buildable>(new File("src/files/yellow_pokemon.json"));
		itemDeck = new Deck<Buildable>(new File("src/files/item_cards.json"));
		eventDeck = new Deck<Buildable>(new File("src/files/event_cards.json"));
		allDecks.add(sDeck);
		allDecks.add(pDeck);
		allDecks.add(gDeck);
		allDecks.add(bDeck);
		allDecks.add(rDeck);
		allDecks.add(yDeck);
		allDecks.add(itemDeck);
		allDecks.add(eventDeck);
	}
	
	public boolean catchPokemon(AbstractPokemon myPokemon) {
		return false;
		// TODO Auto-generated method stub
		
	}


	public AbstractPokemon replacePokemon() {
		// TODO Auto-generated method stub
		return null;
	}


	public void drawEventCard() {
		// TODO Auto-generated method stub
		
	}


	public void DrawItemCard(int cards) {
		// TODO Auto-generated method stub
		
	}


	public void reviveCitySpace() {
		// TODO Auto-generated method stub
		
	}


	public void catchPickPokemon(int type) {
		// TODO Need to finish
		switch(type){
		case 0:
			//take type player on
			break;
		case 1: 
			//pink
			break;
		case 2:
			//green
			break;
		case 3:
			//blue
			break;
		case 4: 
			//red
			break;
		}
		
	}


	public void finalBattle() {
		// TODO Auto-generated method stub
		
	}

	public void revivePickPokemon() {
		// TODO Auto-generated method stub
		
	}

	public void tradeEvent() {
		// TODO Auto-generated method stub
		
	}

	public void unknownDungeon() {
		// TODO Auto-generated method stub
		
	}

	public void attackEvent() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	public void activatePokeBall(String name) {
		activePokeball = name;
	}

	public void addAttackBonus(int value) {
		activeAttackBonus  += value;
	}

	public void setReroll(int roll) {
		activeReroll = roll;
	}

	public void activatePokeDoll() {
		activePokeDoll  = true;
		
	}
	
	private void resetAttackBonus(){
		activeAttackBonus = 0;
	}
	
	private void resetPokeBall(){
		activePokeball = "";
	}
	
	private void resetReroll(){
		activeReroll = 0;
	}
	
	private void resetPokeDoll(){
		activePokeDoll = false;
	}
}

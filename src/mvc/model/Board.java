/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import mvc.model.card.BigCitiesCard;
import mvc.model.card.DestinationCards;
import mvc.model.card.TrainCard;

/**
 * this class manage the 5 cards in the middle.
 * @author george_pantel
 */
public class Board {
	private ArrayList<TrainCard> boardCards = new ArrayList<TrainCard>();
	private ArrayList<TrainCard> trainDeck = new ArrayList<TrainCard>() ;
	private ArrayList<DestinationCards> destinationDeck = new ArrayList<DestinationCards>();
	private ArrayList<BigCitiesCard> BigCitiesDeck = new ArrayList<BigCitiesCard>();
	
	/**
	 * Takes a card from the list and then replace it with another
	 * of the deck(the top one)
	 * Preconditions: index less than size of the list
	 * @param index of the card to return
	 * @return the card of the index
	 */
	public TrainCard takeCardFromBoardCards(int index) {
		
		return null;
	}
	
	/**
	 * take the top card of the train deck
	 * @return the top card
	 */
	public TrainCard takeCardFromTrainDeck() {
		
		return null;
	}
	
	/**
	 * take the top card of the train deck
	 * @return the top card
	 */
	public DestinationCards takeCardFromDestinationDeck() {
		
		return null;
	}
    
	/**
	 * adds a card to the bottom of the deck
	 * @param card to be added
	 */
	public void addToEndOfDestinationDeck(DestinationCards card) {
		if (destinationDeck.size() > 0)
			destinationDeck.add(destinationDeck.size() - 1, card);
		else
			destinationDeck.add(0, card);
	}
	
	/**
	 * Takes a card from the big cities list 
	 * Preconditions: index less than size of the list
	 * @param index of the card to return
	 * @return the card of the index
	 */
	public BigCitiesCard takeBigCityCard(int index) {
		
		return null;
	}
	
	/**
	 * @return the size of the train deck
	 */
	public int trainDeckSize() {
		return trainDeck.size();
	}
	
	/**
	 * @return the size of destination deck
	 */
	public int destinationDeckSize() {
		return destinationDeck.size();
	}
	
	/**
	 * reads all the cards from the file and initializing them
	 * to the destination cards
	 * @param filePath of the cvs file
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void readDestinationCards(String filePath) throws FileNotFoundException, IOException {
	        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
	        String sCurrentLine = "";
	        DestinationCards tmp;
	        int i = -1;
	        while ((sCurrentLine = br.readLine()) != null) {
	            if (i == -1) {
	                i = 0;
	                continue;
	            }
	            String[] splitLine = sCurrentLine.split(",");
	            int id = Integer.parseInt(splitLine[0]);
	            String from = splitLine[1];
	            String to = splitLine[2];
	            int score = Integer.parseInt(splitLine[3]);
	            String colorsList = splitLine[4];
	            String[] splitColors = colorsList.split("-");
	            ArrayList<String> colors = new ArrayList<String>();
	            colors.addAll(Arrays.asList(splitColors));
	            String imagePath = splitLine[5];
	            tmp = new DestinationCards(score, null, true, imagePath, id, from, to, colors);
	            destinationDeck.add(tmp);
	        }
	 }
	 
	 /**
	  * initializing the train deck
	  */
	 public void makeTrainDeck() {
		 
	 }
	 
	 /**
	  * initializing the deck of big cities
	  */
	 public void makeBigCitiesDeck() {
		 
	 }
	 
	/**
	 * accessor for boardCards
	 * @return boardCards
	 */
	public ArrayList<TrainCard> getBoardCards() {
        return boardCards;
    }
}

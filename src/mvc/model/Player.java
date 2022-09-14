/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.ArrayList;
import mvc.model.card.Card;
import mvc.model.card.DestinationCards;
import mvc.model.card.TrainCard;

/**
 * This class is for the player and all his cards, his RailYard,
 * his OnTheTrack and his score. 
 * @author george_pantel
 */
public class Player {
	
	private ArrayList<TrainCard> trainCards = new ArrayList<TrainCard>();
    private ArrayList<DestinationCards> destinationCards = new ArrayList<DestinationCards>();
    private boolean turn = false;
    private Rail rail = new Rail();
    private OnTheTrack track = new OnTheTrack();
    private int score = 0;
    private int[] bigCityCounter = new int[6];
    
    /**
     * draws a train card from the deck and puts it to
     * players cards
     * Preconditions: card must not be null
     * @param card that was drawn
     */
    public void drawTrainCard(TrainCard card) {}
    
    /**
     * draws a destination card from the deck and puts it
     * to players destination cards
     * Preconditions: card must not be null
     * @param card that was drawn
     */
    public void drawDestinationCard(DestinationCards card) {}
    
    /**
     * chooses a group of train cards from the cards he has on hand
     * @return a list with the chosen cards
     */
    public ArrayList<TrainCard> chooseTrainCard() {
    	
		return null;
	}
    
    /**
     * chooses a group of destination cards from the deck
     * that he wants to keep
     * @return a list with the chosen cards
     */
    public ArrayList<DestinationCards> chooseDestinationCard() {
    	
		return null;
	}
    
    /**
     * check if the player can buy a destination card and 
     * if he can he buys it and take the points
     * Preconditions: card must not be null
     * @param card of the destination that he wants to buy
     */
    public void buyDestinationCard(DestinationCards card) {}
    
    /**
     * accessor
     * @return rail
     */
    public Rail getRail() {
        return rail;
    }
    
    /**
     * accessor
     * @return TrainCards
     */
    public ArrayList<TrainCard> getTrainCards() {
        return trainCards;
    }

    /**
     * it removes a train card from the hand
     * @param card to be removed
     */
    public void removeTrainCards(TrainCard card) {
        this.trainCards.remove(card);
    }
    
    /**
     * accessor
     * @return destinationCards
     */
    public ArrayList<DestinationCards> getDestinationCards() {
        return destinationCards;
    }

    /**
     * it removes a card destination from the hand
     * @param card to be removed
     */
    public void removeDestinationCards(DestinationCards card) {
        this.destinationCards.remove(card);
    }
    
    /**
     * accessor
     * @return track
     */
    public OnTheTrack getTrack() {
        return track;
    }
    
    /**
     * resets the score to 0
     */
    public void resetScore(){
    	this.score = 0;
    }
    
    /**
     * adds to the players score a number
     * @param score to be added
     */
    public void addToScore(int score) {
    	this.score += score;
    }

    /**
     * accessor
     * @return bigCityCounter
     */
	public int[] getBigCityCounter() {
		return bigCityCounter;
	}

	/**
     * accessor
     * @return turn
     */
	public boolean isTurn() {
		return turn;
	}

	/**
	 * it sets the turn to true or false
	 * @param turn
	 */
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
}

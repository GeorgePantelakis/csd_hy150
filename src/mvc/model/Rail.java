/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.ArrayList;

import mvc.model.card.Card;

/**
 * this class is to manage the RailYard
 * @author george_pantel
 */
public class Rail {
    ArrayList<Card> whiteCards = new ArrayList<Card>();
    ArrayList<Card> blackCards = new ArrayList<Card>();
    ArrayList<Card> blueCards = new ArrayList<Card>();
    ArrayList<Card> purpleCards = new ArrayList<Card>();
    ArrayList<Card> redCards = new ArrayList<Card>();
    ArrayList<Card> yellowCards = new ArrayList<Card>();
    ArrayList<Card> orangeCards = new ArrayList<Card>();
    ArrayList<Card> greenCards = new ArrayList<Card>();
    
    /**
     * accessor for a list of cards
     * @return the white cards on the RailYard
     */
    public ArrayList<Card> getWhiteCards() {
        return whiteCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param whiteCards the cards to be set
     */
    public void setWhiteCards(ArrayList<Card> whiteCards) {
    	if (whiteCards != null)
    		this.whiteCards = whiteCards;
    	else
    		throw new EmptyListException();
    }

    /**
     * accessor for a list of cards
     * @return the black cards on the RailYard
     */
    public ArrayList<Card> getBlackCards() {
        return blackCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param blackCards the cards to be set
     */
    public void setBlackCards(ArrayList<Card> blackCards) {
    	if (blackCards != null)
    		this.blackCards = blackCards;
    	else
    		throw new EmptyListException();
    }

    /**
     * accessor for a list of cards
     * @return the blue cards on the RailYard
     */
    public ArrayList<Card> getBlueCards() {
        return blueCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param blueCards the cards to be set
     */
    public void setBlueCards(ArrayList<Card> blueCards) {
    	if (blueCards != null)
    		this.blueCards = blueCards;
    	else
    		throw new EmptyListException();
    }
    
    /**
     * accessor for a list of cards
     * @return the purple cards on the RailYard
     */
    public ArrayList<Card> getPurpleCards() {
        return purpleCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param purpleCards the cards to be set
     */
    public void setPurpleCards(ArrayList<Card> purpleCards) {
    	if (purpleCards != null)
    		this.purpleCards = purpleCards;
    	else
    		throw new EmptyListException();
    }
    
    /**
     * accessor for a list of cards
     * @return the red cards on the RailYard
     */
    public ArrayList<Card> getRedCards() {
        return redCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param redCards the cards to be set
     */
    public void setRedCards(ArrayList<Card> redCards) {
    	if (redCards != null)
    		this.redCards = redCards;
    	else
    		throw new EmptyListException();
    }
    
    /**
     * accessor for a list of cards
     * @return the yellow cards on the RailYard
     */
    public ArrayList<Card> getYellowCards() {
        return yellowCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param yellowCards the cards to be set
     */
    public void setYellowCards(ArrayList<Card> yellowCards) {
    	if (yellowCards != null)
    		this.yellowCards = yellowCards;
    	else
    		throw new EmptyListException();
    }
    
    /**
     * accessor for a list of cards
     * @return the orange cards on the RailYard
     */
    public ArrayList<Card> getOrangeCards() {
        return orangeCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param orangeCards the cards to be set
     */
    public void setOrangeCards(ArrayList<Card> orangeCards) {
    	if (orangeCards != null)
    		this.orangeCards = orangeCards;
    	else
    		throw new EmptyListException();
    }
    
    /**
     * accessor for a list of cards
     * @return the green cards on the RailYard
     */
    public ArrayList<Card> getGreenCards() {
        return greenCards;
    }

    /**
     * add a list of cards of a specific color
     * Preconditions: list must not be null
     * @param greenCards the cards to be set
     */
    public void setGreenCards(ArrayList<Card> greenCards) {
    	if (greenCards != null)
    		this.greenCards = greenCards;
    	else
    		throw new EmptyListException();
    }   
}

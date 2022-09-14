/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.card;

import java.util.ArrayList;

import mvc.model.Player;

/**
 * have some basic information for the cards
 * @author george_pantel
 */
public class Card {
	public enum color {
		blue, red, green, yellow, orange, black, white, purple, all
	}
	
    private String image;
    private Player owner;
    private boolean active;
    
    /**
     * contractor 
     * @param owner of the card
     * @param active if the card is still in game
     * @param image of the card
     */
    public Card(Player owner, boolean active, String image) {
		this.active = active;
		this.image = image;
		this.owner = owner;
	}
    
    /**
     * accesor
     * @return the image path
     */
    public String getImage() {
        return image;
    }

    /**
     * accesor
     * @return the owner of the card
     */
	public Player getOwner() {
		return owner;
	}

	/**
	 * changes the owner of the card
	 * @param owner the new owner
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
     * accesor
     * @return if the card is still in game
     */
	public boolean isActive() {
		return active;
	}

	/**
	 * sets new state to the card
	 * @param active the new state
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
}

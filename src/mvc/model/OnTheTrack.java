package mvc.model;

import mvc.model.card.NotEnoughCardsException;

/**
 * this class manages the OnTheTrack section of 
 * the game
 * @author george_pantel
 */
public class OnTheTrack {
	private int redCards = 0;
	private int blackCards = 0;
	private int blueCards = 0;
	private int greenCards = 0;
	private int purpleCards = 0;
	private int whiteCards = 0;
	private int yellowCards = 0;
	private int orangeCards = 0;
	private int locomotiveCards = 0;
	
	/**
	 * accessor on red cards
	 * @return the number of red cards to OnTheTrack
	 */
	public int getRedCards() {
		return redCards;
	}
	
	/**
	 * It add one more red card
	 */
	public void addRedCard() {
		this.redCards++;
	}
	
	/**
	 * reduces the red cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeRedCard() throws NotEnoughCardsException {
		if(this.redCards > 0)
			this.redCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on black cards
	 * @return the number of black cards to OnTheTrack
	 */
	public int getBlackCards() {
		return blackCards;
	}
	
	/**
	 * It add one more black card
	 */
	public void addBlackCard() {
		this.blackCards++;
	}
	
	
	/**
	 * reduces the black cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeBlackCard() throws NotEnoughCardsException {
		if(this.blackCards > 0)
			this.blackCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on blue cards
	 * @return the number of blue cards to OnTheTrack
	 */
	public int getBlueCards() {
		return blueCards;
	}
	
	/**
	 * It add one more blue card
	 */
	public void addBlueCard() {
		this.blueCards++;
	}	
	
	
	/**
	 * reduces the blue cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeBlueCard() throws NotEnoughCardsException {
		if(this.blueCards > 0)
			this.blueCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on green cards
	 * @return the number of green cards to OnTheTrack
	 */
	public int getGreenCards() {
		return greenCards;
	}
	
	/**
	 * It add one more green card
	 */
	public void addGreenCard() {
		this.greenCards++;
	}	
	
	/**
	 * reduces the green cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeGreenCard() throws NotEnoughCardsException {
		if(this.greenCards > 0)
			this.greenCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on purple cards
	 * @return the number of purple cards to OnTheTrack
	 */
	public int getPurpleCards() {
		return purpleCards;
	}
	
	/**
	 * It add one more purple card
	 */
	public void addPurpleCard() {
		this.purpleCards++;
	}	
	
	/**
	 * reduces the purple cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removePurpleCard() throws NotEnoughCardsException {
		if(this.purpleCards > 0)
			this.purpleCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on white cards
	 * @return the number of white cards to OnTheTrack
	 */
	public int getWhiteCards() {
		return whiteCards;
	}
	
	/**
	 * It add one more white card
	 */
	public void addWhiteCard() {
		this.whiteCards++;
	}	
	
	/**
	 * reduces the white cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeWhiteCard() throws NotEnoughCardsException {
		if(this.whiteCards > 0)
			this.whiteCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on yellow cards
	 * @return the number of yellow cards to OnTheTrack
	 */
	public int getYellowCards() {
		return yellowCards;
	}
	
	/**
	 * It add one more yellow card
	 */
	public void addYellowCard() {
		this.yellowCards++;
	}	
	
	/**
	 * reduces the yellow cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeYellowCard() throws NotEnoughCardsException {
		if(this.yellowCards > 0)
			this.yellowCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on orange cards
	 * @return the number of orange cards to OnTheTrack
	 */
	public int getOrangeCards() {
		return orangeCards;
	}
	
	/**
	 * It add one more orange card
	 */
	public void addOrangeCard() {
		this.orangeCards++;
	}	
	
	/**
	 * reduces the orange cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeOrangeCard() throws NotEnoughCardsException {
		if(this.orangeCards > 0)
			this.orangeCards--;
		else
			throw new NotEnoughCardsException();
	}
	
	/**
	 * accessor on locomotive cards
	 * @return the number of locomotive cards to OnTheTrack
	 */
	public int getLocomotiveCards() {
		return locomotiveCards;
	}
	
	/**
	 * It add one more locomotive card
	 */
	public void addLocomotiveCard() {
		this.locomotiveCards++;
	}	
	
	/**
	 * reduces the locomotive cards by one
	 * Preconditions: must be at list one card
	 * @throws NotEnoughCardsException if there is no cards
	 */
	public void removeLocomotiveCard() throws NotEnoughCardsException {
		if(this.locomotiveCards > 0)
			this.locomotiveCards--;
		else
			throw new NotEnoughCardsException();
	}
}

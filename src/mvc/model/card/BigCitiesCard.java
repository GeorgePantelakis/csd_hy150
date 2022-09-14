package mvc.model.card;

import mvc.model.Player;

/**
 * this class handles the big cities cards
 * @author george_pantel
 */
public class BigCitiesCard extends PointsCard{
	private boolean available;
	
	/**
	 * Constructor
	 * @param points of the card
	 * @param owner of the card
	 * @param active if the card is active
	 * @param image of the card
	 */
	public BigCitiesCard(int points, Player owner, boolean active, String image) {
		super(points, owner, active, image);
		this.available = true;
	}

	/**
	 * checks if the card is available or it is 
	 * already taken by a player
	 * @return boolean
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * if a player takes the card this makes it 
	 * unavailable.
	 */
	public void notAvailable() {
		this.available = false;
	}
}

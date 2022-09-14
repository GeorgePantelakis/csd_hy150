package mvc.model.card;

import mvc.model.Player;

/**
 * this class handles the points cards and stores the points
 * @author george_pantel
 */
public class PointsCard extends Card{
	private int points;
	
	/**
	 * contractor
	 * @param points of the card
	 * @param owner of the card
	 * @param active if the card is active
	 * @param image of the card
	 */
	public PointsCard(int points, Player owner, boolean active, String image) {
		super(owner, active, image);
		this.points = points;
	}
	
	/**
	 * to access the points of the card
	 * @return the points of the card
	 */
	public int getPoints(){
		return points;
	}
}

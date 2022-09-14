package mvc.model.card;

import mvc.model.Player;

/**
 * this class handles the train cards
 * @author george_pantel
 */
public class TrainCard extends Card{
	private color color;
	
	/**
	 * contractor
	 * @param color of the card
	 * @param owner of the card
	 * @param active if the card is still in game
	 * @param image of the card
	 */
	public TrainCard(color color, Player owner, boolean active, String image) {
		super(owner, active, image);
		this.color = color;
	}
	
	/**
	 * accessor
	 * @return the color
	 */
	public color getColor(){
		return color;
	}
}

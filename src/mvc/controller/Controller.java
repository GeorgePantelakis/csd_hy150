/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import mvc.model.Player;
import mvc.model.card.Card;
import mvc.model.card.TrainCard;
import mvc.model.Board;
import mvc.view.View;

/**
 *
 * @author George_Pantel
 */
public class Controller {

    private Board board;
    private View view;
    private Player player1;
    private Player player2;

    /**
     * it is initializing the cards and all the
     * needed values to begin the game. It is called
     * only once every game.
     */
    public void initialize() {
        
    }
    
    /**
     * This method controls each round. It gets to
     * see who is playing and to call the needed 
     * methods for each round.
     */
    public void round() {
    	
    }

    /**
     * It is setting all the listeners of the 
     * buttons
     */
    public void setListeners() {
        
    }

    /**
     * in the start of every turn it moves the first
     * card from each color in RailYard to OnTheTrack
     * Preconditions: list must not be null
     * Preconditions: player must not be null
     * @param cards the cards to be moved
     * @param player the player who wants to move these cards
     */
    public void moveToOnTheTrack(ArrayList<TrainCard> cards, Player player) {
    	
    }
    
    /**
     * checks if the cards can be moved to RailYard by
     * the rules
     * Preconditions: list must not be null
     * Preconditions: player must not be null
     * @param cardToPlay a list of cards we want to play
     * @param player the player who wants to play these cards
     * @return boolean
     */
    public boolean canBeMovedToRail(ArrayList<TrainCard> cardToPlay, Player player) {
		return false;
        
    }
    
    /**
     * moves the cards to players RailYard
     * Preconditions: list must not be null
     * Preconditions: player must not be null
     * @param cardToPlay a list of cards we want to play
     * @param player the player who wants to play these cards
     */
    public void moveToRail(ArrayList<TrainCard> cardToPlay, Player player) {
    	
    }
    
    /**
     * checks if player can do the TrainRob act
     * Preconditions: list must not be null
     * @param cards a list with the cards that he wants to
     * train rob with
     * @return boolean
     */
    public boolean canTrainRob(ArrayList<TrainCard> cards) {
    
    return false;
	}
    
    /**
     * checks if the cards that was chosen is a valid choice
     * @return boolean
     */
    public boolean isValidMove() {
    	
		return false;
	}
    
    /**
     * updates the cards and the numbers on RailYard and
     * on OnTheTrack for each player
     */
    public void updateRailAndTrack() {
        
    }
    
    /**
     * checks if the game is finished by the rules
     * @return boolean
     */
    public boolean checkIfGameFinished() {
		return false;
        
    }
    
    /**
     * it is deciding which player is the winner
     * @return the winner player
     */
    public Player declareWinner() {
    	
		return null;
    }

    /**
     * the main of the program
     * @param args any attributes
     */
    public static void main(String[] args) {

        Controller c = new Controller();
        c.player1 = new Player();
        c.player2 = new Player();
        c.board = new Board();
        c.initialize();
        c.view = new View();
        //c.view.tests();
        c.view.graphics();
        
    }

    /**
     * a listener for the buttons of the players cards
     * @author george_pantel
     */
    private class PlayerAreaListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            }
        }
        
}


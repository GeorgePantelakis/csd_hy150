/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;

import javax.swing.*;

import mvc.model.Player;
import mvc.model.card.Card;
import mvc.model.card.DestinationCards;
import mvc.model.card.TrainCard;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * the class of the GUI of the game
 * @author george_pantel
 */
public class View extends JFrame {
    private JLayeredPaneExtension basic_panel;
    private ClassLoader cldr;
    boolean enabled = true;
    JTextArea infobox;
    JLayeredPane player1 = new JLayeredPane();
    JLayeredPane player2 = new JLayeredPane();
    JLayeredPane board = new JLayeredPane();
    
    /**
     *constructor to make the basic window of the game
     */
    public View() {
    	setTitle("Ticket to Ride: The Card Game");
    	setSize(640, 480);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * it creates all the graphics of the game an at 
     * the beginning of the game with the default 
     * values
     */
    public void graphics() {
    	
    	this.getContentPane().setLayout(null);
    	
    	player1.setLayout(null);
        player1.setPreferredSize(new Dimension(250,0));
        player1.setBackground(Color.white);
        player1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green));
        player1.setOpaque(true);
    	
        JLayeredPane player1rail = new JLayeredPane();
        player1rail.setBounds(10, 10, 200, 100);
        player1rail.setBackground(Color.white);
        player1rail.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        player1rail.setOpaque(true);
        player1.add(player1rail, new Integer(0), 0);
        
        JPanel railcolors = new JPanel();
        railcolors.add(new JLabel("This is layer 1"));
        railcolors.setBounds(0, 0, 100, 100);
        player1rail.add(railcolors, new Integer(0), 0);
        
        board.setLayout(null);
        board.setPreferredSize(new Dimension(250,0));
        board.setBackground(Color.white);
        
        player2.setLayout(null);
        player2.setPreferredSize(new Dimension(250,0));
        player2.setBackground(Color.white);
        player2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red));
        player2.setOpaque(true);
        
    	JPanel mainPane = new JPanel();
    	LayoutManager layout = new BoxLayout(mainPane, BoxLayout.Y_AXIS);
    	Box boxes[] = new Box[3];
    	boxes[0].add(player1);
    	boxes[1].add(board);
    	boxes[2].add(player2);
    	
        add(mainPane, 0);
        
        pack();
    	setTitle("Ticket to Ride: The Card Game");
    	setBounds(200, 200, 640, 480);
    	setBackground(Color.GREEN);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void tests() {
    	JLayeredPane westPanel = new JLayeredPane();
        westPanel.setLayout(null);
        westPanel.setPreferredSize(new Dimension(0,400));
        westPanel.setBackground(Color.blue);
        westPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        westPanel.setOpaque(true);

        JPanel layerOne = new JPanel();
        layerOne.add(new JLabel("This is layer 1"));
        layerOne.setBounds(10, 10, 100, 100);
        westPanel.add(layerOne, new Integer(0), 0);

        JPanel layerTwo = new JPanel();
        layerTwo.add(new JLabel("This si layer 2"));
        layerTwo.setBounds(10, 150, 100, 100);
        westPanel.add(layerTwo, new Integer(1), 0);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.yellow);

        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(0,400));
        eastPanel.setBackground(Color.red);

        JPanel mainPane = new JPanel();
        mainPane.setLayout(new GridLayout(3, 0));
        mainPane.add(westPanel);
        mainPane.add(centerPanel);
        mainPane.add(eastPanel);

        setTitle("lala");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 800, 500);
        this.setContentPane(mainPane);
        this.setVisible(true);
    }
    
    /**
     * updates player's OnTheTrack in the GUI
     * prerequisite: input must be an array of 9 elements
     * @param input of the number of each card type to OnTheTrack
     * @param player the player of interest
     */
    public void updateOnTheTrack(int[] input, Player player) {
    	
    }
    
    /**
     * updates player's RailYard in the GUI
     * prerequisite: input must be an array of 9 elements
     * @param input of the list of each card in RailYard
     * @param player the player of interest
     */
    public void updateRailYard(ArrayList<TrainCard>[] input, Player player) {
    	
    }
    
    /**
     * shows the player what train cards have on hand
     * @param cards the list of the cards
     * @param player the player of interest
     */
    public void initTrainCards(ArrayList<TrainCard> cards, Player player) {
    	
    }
    
    /**
     * updates player's RailYard in the GUI
     * @param score the value of the current player's score
     * @param player the player of interest
     */
    public void updateScore(int score, Player player) {
    	
    }
    
    /**
     * changes the turns in the GUI
     * @param player the player who has his turn now
     */
    public void updateTurn(Player player) {
    	
    }
    
    /**
     * shows the player what destination cards have on hand
     * @param cards the list of the cards
     * @param player the player of interest
     */
    public void initDestinationCards(ArrayList<DestinationCards> cards, Player player) {
    	
    }
    
    /**
     * opens a new message window with the message on it
     * @param message to be displayed in the new window
     */
    public void showWinningMessage(String message) {
        JOptionPane.showMessageDialog(this, message);

    }
    
}

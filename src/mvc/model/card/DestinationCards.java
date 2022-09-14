/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.card;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import mvc.model.Player;

/**
 * this class handles the destination cards
 * @author george_pantel
 */
public class DestinationCards extends PointsCard{
	private ClassLoader cldr;  
	private int id;
	private String from;
	private String to;
	private ArrayList<String> neededColors;
    
	/**
	 * contractor
	 * @param points of the card
	 * @param owner of the card
	 * @param active if the card is still on the game
	 * @param image of the card
	 * @param id the unique id of the card
	 * @param from where the road starts
	 * @param to the destination of the card
	 * @param neededColors the colors of cards needed to buy the card
	 */
	public DestinationCards(int points, Player owner, boolean active, String image, int id, String from, String to, ArrayList<String> neededColors) {
		super(points, owner, active, image);
		this.id = id;
		this.from = from;
		this.to = to;
		this.neededColors = neededColors;
	}

    /**
     * accessor
     * @return id
     */
    public int getId() {
		return id;
	}
	
	/**
     * accessor
     * @return from
     */
	public String getFrom() {
		return from;
	}

	/**
     * accessor
     * @return to
     */
	public String getTo() {
		return to;
	}

	/**
     * accessor
     * @return needed colors
     */
	public ArrayList<String> getNeededColors() {
		return neededColors;
	}
}

package edu.westmont.vr_nudge;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class VirtualMap {

	public VirtualMap(String filename) {
	}

	/**
	 * 
	 * @return the width of the virtual map in cm
	 */
	public Integer getWidth() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @return the length of the virtual map in cm
	 */
	public Integer getLength() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param pm the physical map
	 * @param x the x position to evaluate
	 * @param y the y position to evaluate
	 * @param degree the rotation of the virtual map to evaluate
	 * @return a CostMap with the same dimensions as the physical Map
	 * @throws IOException 
	 */
	public CostMap calculateCostMap(PhysicalMap pm, Integer x, Integer y, Integer degree) throws IOException {
		// TODO Auto-generated method stub
		//if the cost of the next step is greater than the cost of the first step increase the cost?
		
		/*Base*/
		//assign the first row and columns with values 1.0-20.0 and 20.0-1.0
		//all other square are calculated from the product of the row and column
		
		//Double base = fillSide(pm.getLength(), x) * fillSide(pm.getWidth(), y);
	
		
		/*Modification*/
		//depending on the degree add points (would we possibly want to subtract?)
		
		
		//read in the png map to generate a bit map
		try{
		BufferedImage ourMap = ImageIO.read(new File("path"));
		}
		
		catch(IOException e){
			System.out.println("File not found");
		}
		return null;
	}



}

package edu.westmont.vr_nudge;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class VirtualMap {
	
	Integer width;
	Integer length;
	BufferedImage outputMap;

	public VirtualMap(String filename) {
		
		try{
			
			BufferedImage inputMap = ImageIO.read(new File(filename));
			/*int color = ourMap.getRGB(0, 0);
			System.out.println(color);*/
			File output = new File("images/bit.bmp");
			ImageIO.write(inputMap, "bmp", output);
			outputMap = ImageIO.read(output);
			
			width = outputMap.getWidth();
			length = outputMap.getHeight();
	
		
		}
		
		catch(IOException e){
			System.out.println("File not found");
		}
		
	}

	/**
	 * 
	 * @return the width of the virtual map in cm
	 */
	public Integer getWidth() {
		return width;
	}
	
	/**
	 * 
	 * @return the length of the virtual map in cm
	 */
	public Integer getLength() {
		return length;
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
		outputMap.getRGB(x, y);
		
		return null;
	}
	
	public double distToWall(PhysicalMap pm, Integer x, Integer y, Integer degree){
		//TODO: implement everything
		
		double dist = 0.0;
	
/*			
if(degree <= 45){
	//distance from right-hand wall to location divided by cos of angle with x axis will return the hypotenuse which is the distance to the wall
	dist = (pm.getWidth()-x) / (Math.cos(degree));
}
else if(degree <= 90){
	dist = (pm.getLength()-y) / (Math.cos(90-degree));
}
else if(degree <= 135){
	dist = (pm.getLength()-y) / (Math.cos(degree-90));	
}
else if(degree <= 180){
	dist = (x) / (Math.cos(180-degree));	
}
else if(degree <= 225){
	dist = (x) / (Math.cos(degree-180));
}
else if(degree <= 270){
	dist = (y) / (Math.cos(270-degree));
}
else if(degree <= 315){
	dist = (y) / (Math.cos(degree-270));
}
else{
	dist = (pm.getWidth()-x) / (Math.cos(360-degree));
}*/
		return dist;
		
	}



}

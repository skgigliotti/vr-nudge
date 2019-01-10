package edu.westmont.vr_nudge;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
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
	
	public BufferedImage getImage() {
		return outputMap;
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
		BufferedImage finale=new BufferedImage(width, length, BufferedImage.TYPE_3BYTE_BGR);
		
		
		
		
		

		//go through each point in the virtual map
		//if the point is colored, make the point black
		//if the point is white, it will remain white
		for(Integer w = 0; w < width;w++) {
			for(Integer l = 0; l < length;l++){
				int rgbVal = outputMap.getRGB(w, l);
				int red = (rgbVal >> 16) & 0xFF;
				int green = (rgbVal >> 8) & 0xFF;
				int blue = (rgbVal & 0xFF);
				
				//convert the rgb value to greyscale and normalize it
				int grey = ((red + green + blue) / 3) / 255;
				if(grey == 1){
					grey = 255;
				}
				
				finale.setRGB(w,l,(byte)grey);
				
				
			}
			
		}
		
		//pixels of the virtual world
		byte[] pixels = ((DataBufferByte) finale.getRaster().getDataBuffer()).getData();
		
		//make a white square for the physical world, just a concept of the first 1600 are white and rest are black
		byte[] pixels2 = ((DataBufferByte) finale.getRaster().getDataBuffer()).getData();
		for(int i=0; i < pixels2.length; i++){
			if(i < (pm.getLength() * pm.getWidth())){
				pixels2[i] = 1;
			}
			else{
				pixels2[i] = 0;
			}
			
		}
		
		ImageIO.write(finale, "jpg", new File("output.jpg"));
		return null;
	}
	
	public double distToWall(PhysicalMap pm, Integer x, Integer y, Integer degree){
		//TODO: implement everything
		
		double dist = 0.0;
		return dist;
		
	}


// make array of 0 and 1 for virtual map and physical map and & the two
	//want physical map layer to be same size as virtual
	//for now in the top left corner
}

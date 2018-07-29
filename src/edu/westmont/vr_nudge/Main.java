package edu.westmont.vr_nudge;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {

	private static final int DEGREE_STEPS = 10;

	public static void main(String[] args) {
		
		/*VirtualMap vm = new VirtualMap("filename");
		PhysicalMap pm = new PhysicalMap(400,400);
		CostMap costs[][][] = new CostMap[vm.getLength()][vm.getWidth()][360/DEGREE_STEPS];
		Boolean image = false;*/
		/*Base*/
		//read in the png map to generate a bit map
		try{
	
		BufferedImage ourMap = ImageIO.read(new File("images/kerr.png"));
	
		/*int color = ourMap.getRGB(0, 0);
		System.out.println(color);*/
		File output = new File("images/bit.bmp");
		ImageIO.write(ourMap, "bmp", output);
		
		/*int colorBit = output;
		System.out.println(colorBit);*/
		
		System.out.println(ourMap);
		System.out.println(output);
		
		}
		
		catch(IOException e){
			System.out.println("File not found");
		}
		
		/*for(Integer w = 0; w < vm.getWidth();w++) {
			for(Integer l = 0; l < vm.getLength();l++){
				for(Integer degree = 0 ; degree < 360; degree += DEGREE_STEPS) {
					CostMap cm = vm.calculateCostMap(pm,w,l,degree);
					costs[l][w][degree]= cm;
				}
				
				
			}
		}*/
		
		

	}

}
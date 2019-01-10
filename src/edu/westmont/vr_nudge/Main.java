
package edu.westmont.vr_nudge;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Main {

	private static final int DEGREE_STEPS = 90;

	public static void main(String[] args) throws IOException {
		PhysicalMap pm = new PhysicalMap(400,400);
		/*VirtualMap vm = new VirtualMap("filename");
		
		CostMap costs[][][] = new CostMap[vm.getLength()][vm.getWidth()][360/DEGREE_STEPS];
		Boolean image = false;*/
		/*Base*/
		//read in the png map to generate a bit map
		VirtualMap vm = new VirtualMap("images/virtualMap.png");
		
		
		//just put the buffered image here to use in trying to make a black and white map
		//for testing purposes
		try {
			vm.calculateCostMap(new PhysicalMap(500,500), 200, 200, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Integer w = 0; w < vm.getWidth();w++) {
			for(Integer l = 0; l < vm.getLength();l++){
				for(Integer degree = 0 ; degree < 360; degree += DEGREE_STEPS) {
					CostMap cm = vm.calculateCostMap(pm,w,l,degree);
				}
				
				
			}
		}
	
 		
 	



	}

}
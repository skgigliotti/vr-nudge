package edu.westmont.vr_nudge;

public class Main {

	private static final int DEGREE_STEPS = 10;

	public static void main(String[] args) {
		
		VirtualMap vm = new VirtualMap("filename");
		PhysicalMap pm = new PhysicalMap(400,400);
		CostMap costs[][][] = new CostMap[vm.getLength()][vm.getWidth()][360/DEGREE_STEPS];
		
		
		for(Integer w = 0; w < vm.getWidth();w++) {
			for(Integer l = 0; l < vm.getLength();l++){
				for(Integer degree = 0 ; degree < 360; degree += DEGREE_STEPS) {
					CostMap cm = vm.calculateCostMap(pm,w,l,degree);
					costs[l][w][degree]= cm;
				}
				
				
			}
		}
		
		

	}

}
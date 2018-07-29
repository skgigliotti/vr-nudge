package edu.westmont.vr_nudge;

public class PhysicalMap {

	private Integer width;
	private Integer length;
	private Double hyp;

	/**
	 * 
	 * @param width the width of the physical game space in cm
	 * @param length the length of the physical game space in cm
	 */
	public PhysicalMap(Integer width, Integer length) {
		this.width = width;
		this.length = length;
	}
	
	public Double getHyp(){
		hyp = Math.hypot(width, length);
		return hyp;
	}
	
	
	/**
	 * 
	 * @return returns the width
	 */
	public Integer getWidth(){
		return width;
	}
	
	/**
	 * 
	 * @return returns the length
	 */
	public Integer getLength(){
		return length;
	}
	
	

}

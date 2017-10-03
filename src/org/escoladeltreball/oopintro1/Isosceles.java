package org.escoladeltreball.oopintro1;

/**
 * @author Alex Susin
 *
 */
public class Isosceles extends Triangle {
	
	protected double equalSide;
	protected double side;

	/**
	 * @param equalSide
	 * @param side
	 */
	public Isosceles(double equalSide, double side) {
		this.equalSide = equalSide;
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 2 * equalSide + side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return (side * Math.sqrt(Math.pow(equalSide, 2) - (Math.pow(side, 2) / 4))) / 2;
	}
	
	

}

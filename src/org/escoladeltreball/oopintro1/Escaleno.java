/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw21752927
 *
 */
public class Escaleno extends Triangle {

	protected double side1;
	protected double side2;
	protected double side3;
	
	
	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Escaleno(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}


	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		double semiPerimeter = perimeter() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	}
	
	

}

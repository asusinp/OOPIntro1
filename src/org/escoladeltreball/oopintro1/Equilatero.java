/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw21752927
 *
 */
public class Equilatero extends Triangle {

	protected double side;
	
	/**
	 * @param side
	 */
	public Equilatero(double side) {	
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return (Math.pow(3, 1.0/3.0) / 4) * Math.pow(side, 2);
	}



}

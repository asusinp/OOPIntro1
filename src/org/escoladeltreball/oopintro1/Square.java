/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author Alex Susin
 *
 */
public class Square extends FigureImpl {
	
	private double side;
	
	/**
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return side * 4;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return side * side;
	}



}

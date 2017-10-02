/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author Alex Susin
 *
 */
public abstract class Triangle extends FigureImpl {
	
	protected double base;
	protected double height;
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return (base * height) / 2;
	}

}

/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw21752927
 *
 */
public class Isosceles extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Isosceles(double base, double height) {
		super(base, height);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 3 * height + base;
	}

}

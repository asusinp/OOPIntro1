/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw21752927
 *
 */
public class Escaleno extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Escaleno(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base * 2 + height;
	}

}

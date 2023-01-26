/**
 * 
 */

/**
 * @author aung
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I initialized Square and printed out it's area by giving the side in the ()
		Square sqr = new Square(38);
		System.out.println("Square area: "+sqr.area());
		
		//I initialized Circle and printed out it's area by giving the radius in the ()
		Circle cir = new Circle(25);
		System.out.println("Circle area: "+cir.area());
	}

}

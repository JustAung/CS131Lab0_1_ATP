/**
 * 
 */

/**
 * @author aung
 *
 */
public class Square 
{
double side;
//variable side
//getter
public double getSide(){
	return side;
}//end of getter
//setter
public void setSide(double side) {
	this.side=side;
}//end of setter
//default constructor
public Square() {
	side = 0;
}//end of default constrcutor where i set side to equal 0
//preferred constructor s is the parameter
public Square(double s) {
	side = s;
}//end of the preferred constructor where i set side to the parameter s
//method
public double area() {
	double area_square = Math.pow(side, 2);
	return area_square;
}//end of method for getting the area of a square where i set the equation and returned it
}//end of class

/** 
Represents a line segment on a 2D plane drawn between two cartesian points in the format of (x,y).
@author Matthew C. Morgan - 3430092
*/
public class LineSegment{
		/**The location of the first point in the x direction. */
	private double x1;
		/**The location of the first point in the y direction. */
	private double y1;
		/**The location of the second point in the x direction. */
	private double x2;
		/**The location of the second point in the y direction. */
	private double y2;
		/**The first cartesian point that signifies an end point of the line segment. */
	private CartesianPoint cp1;
		/**The second cartesian point that signifies an end point of the line segment. */
	private CartesianPoint cp2;
		/** Constructs a line from two given cartesian points.
		  @param cp1In The first cartesian point that signifies an end point of the line segment.
		  @param cp2In The second cartesian point that signifies an end point of the line segment.
		*/
	public LineSegment(CartesianPoint cp1In, CartesianPoint cp2In){
		cp1 = new CartesianPoint(cp1In.getX(), cp1In.getY());
		cp2 = new CartesianPoint(cp2In.getX(), cp2In.getY());
	}
		/** Constructs a line from a given cartesian point, an x value and a y value.
		  @param cp1In The first cartesian point that signifies an end point of the line segment.
		  @param x2In The x value of a cartesian point that signifies an end point of the line segment.
		  @param y2In The y value of a cartesian point that signifies an end point of the line segment.
		*/
	public LineSegment(CartesianPoint cp1In, double x2In, double y2In){
		cp1 = new CartesianPoint(cp1In.getX(), cp1In.getY());
		cp2 = new CartesianPoint(x2In, y2In);
	}
		/** Constructs a line from two given cartesian points, in the form of x1,y1,x2,y2.
		  @param x1In The x value of a cartesian point that signifies an end point of the line segment.
		  @param y1In The y value of a cartesian point that signifies an end point of the line segment.
		  @param x2In The x value of a cartesian point that signifies an end point of the line segment.
		  @param y2In The y value of a cartesian point that signifies an end point of the line segment.
		*/
	public LineSegment(double x1In, double y1In, double x2In, double y2In){
		cp1 = new CartesianPoint(x1In, y1In);
		cp2 = new CartesianPoint(x2In, y2In);
	}
		/** Returns the x and y values for this point.
		  @return The x and y values for this point.
		*/
	public CartesianPoint getEndPoint1(){
		return this.cp1;
	}
		/** Returns the x and y values for this point.
		  @return The x and y values for this point.
		*/
	public CartesianPoint getEndPoint2(){
		return this.cp2;
	}
		/** Returns the difference of the two cartesian point y values in a line segment.
		  @return The change in y values of a line.
		*/
	public double getRise(){
		return (this.cp2.getY() - this.cp1.getY());
	}
		/** Returns the difference of the two cartesian point x values in a line segment.
		  @return The change in x values of a line.
		*/
	public double getRun(){
		return (this.cp2.getX() - this.cp1.getX());
	}
		/** Compares the change in slope of 2 lines to determine if they are parallel.
		  @param ls1In The line being compared
		  @return true if the line is parallel
		*/
	public boolean isParallelTo(LineSegment ls1In){
		if(this.getRise()/this.getRun() != ls1In.getRise()/ls1In.getRun()){
		return false;
		}else{
		return true;
		}
	}
		/** Calculates the mid point of a line segment.
		  @return The cartesian point midway between the end points.
		*/
	public CartesianPoint getMidPoint(){
		double xVal = (.5*(this.cp1.getX() + this.cp2.getX()));
		double yVal = (.5*(this.cp1.getY() + this.cp2.getY()));
		CartesianPoint mp = new CartesianPoint(xVal, yVal);
		return mp;
	}
		/** Calculates the length of a line segment by measuring the distance between end points.
		  @return The length of the line segment.
		*/
	public double getLength(){
		return this.getEndPoint1().distance(this.getEndPoint2());
	}
	
}
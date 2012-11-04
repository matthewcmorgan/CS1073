/**
@author Matthew Morgan - 3430092
*/
public class Tube{
		private double radius;
		private double height;
	public Tube(double rIn, double hIn){
		radius = rIn;
		height = hIn;
	}
	public double getRadius(){
		return radius;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return ((Math.PI)*(Math.pow(radius,2))*height);
	}
	public double getSurfaceArea(){
		return ((2*((Math.PI)*(Math.pow(radius,2))))+((2*(Math.PI)*radius)*height));
	}
}
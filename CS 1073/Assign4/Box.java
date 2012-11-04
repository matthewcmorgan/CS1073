/**
@author Matthew Morgan - 3430092
*/
public class Box{
		private double length;
		private double width;
		private double height;
	public Box(double lIn, double wIn, double hIn){
		length = lIn;
		width = wIn;
		height = hIn;
	}
	public double getlength(){
		return length;
	}
	public double getwidth(){
		return width;
	}
	public double getheight(){
		return height;
	}
	public double getVolume(){
		return length*width*height;
	}
	public double getSurfaceArea(){
		return ((2*length*width)+(2*width*height)+(2*length*height));
	}
}
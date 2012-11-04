/**
@author Matthew C. Morgan - 3430092
*/
public class LineTest{
	public static void main(String[] args){
		CartesianPoint origin = new CartesianPoint(0.0, 0.0);
		CartesianPoint line1point2 = new CartesianPoint(0.0, 5.0);
		CartesianPoint commonPoint = new CartesianPoint(2.0, 5.0);
		LineSegment line1 = new LineSegment(origin, line1point2);
		LineSegment line2 = new LineSegment(commonPoint, 2.0, 7.0);
		LineSegment line3 = new LineSegment(1.0, 5.0, 6.0, 5.0);
		LineSegment line4 = new LineSegment(commonPoint, 7.3, 10.1);
		LineSegment line5 = new LineSegment(0.0, -3.0, 10.6, 7.2);
		LineSegment line6 = new LineSegment(0.0, -3.0, 10.6, 3.0);
		LineSegment line7 = new LineSegment(commonPoint, commonPoint);
		System.out.println("The first line segment travels between:" + '\n' + line1.getEndPoint1() + " and " + line1.getEndPoint2() );
		System.out.println("The second line segment travels between:" + '\n' + line2.getEndPoint1() + " and " + line2.getEndPoint2() );
		System.out.println("The third line segment travels between:" + '\n' + line3.getEndPoint1() + " and " + line3.getEndPoint2() );
		System.out.println("The fourth line segment travels between:" + '\n' + line4.getEndPoint1() + " and " + line4.getEndPoint2() );
		System.out.println("The fifth line segment travels between:" + '\n' + line5.getEndPoint1() + " and " + line5.getEndPoint2() );
		System.out.println("The sixth line segment travels between:" + '\n' + line6.getEndPoint1() + " and " + line6.getEndPoint2() );
		System.out.println("The seventh line segment travels between:" + '\n' + line7.getEndPoint1() + " and " + line7.getEndPoint2() );
		if(line1.isParallelTo(line2)){
			System.out.println("Line 1 is parallel to Line 2");
		}else{
			System.out.println("Line 1 is not parallel to Line 2");
		}
		if(line1.isParallelTo(line3)){
			System.out.println("Line 1 is parallel to Line 3");
		}else{
			System.out.println("Line 1 is not parallel to Line 3");
		}
		if(line4.isParallelTo(line5)){
			System.out.println("Line 4 is parallel to Line 5");
		}else{
			System.out.println("Line 4 is not parallel to Line 5");
		}
		if(line4.isParallelTo(line6)){
			System.out.println("Line 4 is parallel to Line 6");
		}else{
			System.out.println("Line 4 is not parallel to Line 6");
		}
		if(line4.isParallelTo(line4)){
			System.out.println("Line 4 is parallel to itself");
		}else{
			System.out.println("Line 4 is not parallel to itself");
		}
		System.out.println("Line Segment 1 has a midpoint of: " + line1.getMidPoint());
		System.out.println("Line Segment 3 has a midpoint of: " + line3.getMidPoint());
		System.out.println("Line Segment 4 has a midpoint of: " + line4.getMidPoint());
		System.out.println("Line Segment 7 has a midpoint of: " + line7.getMidPoint());
		System.out.println("Line Segment 1 has a length of: " + line1.getLength());
		System.out.println("Line Segment 3 has a length of: " + line3.getLength());
		System.out.println("Line Segment 4 has a length of: " + line4.getLength());
		System.out.println("Line Segment 7 has a length of: " + line7.getLength());
	}
}
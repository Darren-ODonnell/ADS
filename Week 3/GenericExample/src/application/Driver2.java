package application;

import generics.Pair;

public class Driver2 {

	
	public Driver2(){
		Point point1 = new Point(1,1);
		Point point2 = new Point(1,4);
		Point point3 = new Point(1,1);
		Point point4 = new Point(1,4);

		Pair<Point> p1 = new Pair<Point>(point1, point2);
		Pair<Point> p2 = new Pair<Point>(point3, point4);
		
		if (p1.equals(p2))
			System.out.println("They are the same");
		else
			System.out.println("They are not the same");
		
		System.out.println("First item:  " + p1.toString() + "  Second item: " + p2.toString());
	
	}
	
	public static void main(String[] args){
		new Driver2();
	}
}

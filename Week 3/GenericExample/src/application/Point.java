package application;

public class Point {
	int x;
	int y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object o){
		Point p = (Point) o;
		
		boolean equals = false;
		
		int x = p.getX();
		int y = p.getY();
		
		if(x == this.x && y == this.y){
			equals = true;
		}
		return equals;
	}
}

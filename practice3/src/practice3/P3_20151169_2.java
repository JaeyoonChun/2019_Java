// 20151169 √µ¿Á¿±
package practice3;

class Point{
	private double x;
	private double y;
	
	Point(double x, double y){
		this.x = x;
		this.y = y;		
	}
	double getX() {return this.x;}
	double getY() {return this.y;}
	String info() {
		String str = "("+ this.x+","+this.y+")";
		return str;
	}
}

public class P3_20151169_2 {

	static double getDistance(Point p1, Point p2) {
		double xSub = p1.getX()-p2.getX();
		double ySub = p1.getY()-p2.getY();
		return Math.sqrt(Math.pow(xSub,2) + Math.pow(ySub,2));
	}
	public static void main(String[] args) {
		Point p1 = new Point(1.2, 3.5);
		Point p2 = new Point(2.5, 1.0);
		
		double dist = 0.0; 
		dist = getDistance(p1, p2); 
		System.out.println("p1 : " + p1.info()); 
		System.out.println("p2 : " + p2.info());
		System.out.println("distance : " + dist);
	}
}

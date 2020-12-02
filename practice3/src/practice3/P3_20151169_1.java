//20151169 천재윤
package practice3;

class Circle{
	private double radius;
	private final static double PI = 3.141592;

	Circle(){}
	Circle(double r){
		this.radius = r;
	}

	void setRadius(double r) {this.radius=r;}
	double getRadius() {return this.radius;}
	double getArea() {return PI*this.radius*this.radius;}
	double getPerimeter() {return 2*PI*this.radius;}
	void incRadius(double x) {this.radius+=x;}

}

public class P3_20151169_1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.5);
		Circle c2 = new Circle();
		System.out.println("c1 반지름 : "+ c1.getRadius());
		c2.setRadius(1.7); 
		System.out.println("c2 반지름 : " + c2.getRadius()); 
		double c1Area = c1.getArea();
		double c1Perimeter = c1.getPerimeter();  
		System.out.println("c1 면적: " + c1Area + ", c1 둘레 : " + c1Perimeter);

		c2.incRadius(2.0);               
		System.out.println("c2 반지름 : " + c2.getRadius());
		System.out.println("c2 면적 : " + c2.getArea() + ", 둘레 : " + c2.getPerimeter());
	}

}

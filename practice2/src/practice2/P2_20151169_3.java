package practice2;

class Rectangle{
	int width;
	int height;
	
	Rectangle(){}
	Rectangle(int w, int h){
		width = w;
		height = h;
	}
	
	void setWidthHeight(int w, int h) {
		width = w;
		height= h;
	}
	
	void printInfo() {
		System.out.println("width : "+width+", height : "+height);
	}
	
	int getArea() {
		return width*height;
	}
	
	int getPerimeter() {
		return (2*width)+(2*height);
	}
	
	void incWidth(int n) {
		width += n;
	}
	
	void incHeight(int n) {
		height += n;
	}
}

public class P2_20151169_3 {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		Rectangle r2 = new Rectangle();
		r2.setWidthHeight(7,9); // 인스턴스 r2의 필드 width를 7로, height를 9로 저장한다. 
		r1.printInfo(); // 인스턴스 r1의 width, height를 출력한다. 
		System.out.println("r1의 넓이 : " + r1.getArea() + ", r1의 둘레 : " + r1.getPerimeter());
		r2.incWidth(3); // r2의 width를 3 증가시킨다. 즉, 10으로 만든다.
		r2.incHeight(10); // r2의 height를 10만큼 증가시킨다. 즉, 19로 만든다. 
		r2.printInfo(); // 인스턴스 r2의 width, height를 출력한다.
		System.out.println("r2의 넓이 : " + r2.getArea() + ", r2의 둘레 : " + r2.getPerimeter());
	}
}

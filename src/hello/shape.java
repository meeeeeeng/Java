package hello;

class Shape1 {
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}

}

class Rectangle extends Shape1 {
	protected int width,height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}

}

class Triangle extends Shape1 {
	protected int base,height;
	public void draw() {
		System.out.println("Triangle Draw");
	}

}
class Circle extends Shape1 {
	protected int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}

}

public class shape{
	public static void main(String args[]) {
		
		Shape1 s[]= {new Shape1(),new Rectangle(),new Triangle(),new Circle()};
		
		/*
		s1=new Shape1();
		s2=new Rectangle();
		s3=new Triangle();
		s4=new Circle();
		*/
		
		
		for(int i=0;i<4;i++) {
			
			s[i].draw();
		}
		
		
	}
	
	
	
	
} 


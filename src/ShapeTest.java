
public class ShapeTest {
	
	private static Shape arrayOfShapes[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		init();
		darwAll();
	}
	
	public static void init() {
		arrayOfShapes=new Shape[3];
	
		Shape s1,s2,s3,s4;
		
		s1=new Shape();
		s2=new Rectangle();
		s3=new Triangle();
		s4=new Circle();
		
		

		s1.draw();	
		s2.draw();	
		s3.draw();	
		s4.draw();	
		


	}

}

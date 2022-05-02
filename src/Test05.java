
public class Test05 extends midterm05{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		midterm05 obj[] = new midterm04("A3","seoul");
		obj[]=new midterm05[2];
		obj[0]=new dog();
		obj[1]=new cat();
		
		
		
		for(int i=0;i<2;i++) {
			
			obj[i].sound();
			
		}
	}

}

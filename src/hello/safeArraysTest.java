package hello;

public class safeArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		safeArrays array=new safeArrays(3);
		
		for(int i=0;i<(array.length+1);i++) {
			
			array.put(i,i*10);
		}
	
		
		
	}

}

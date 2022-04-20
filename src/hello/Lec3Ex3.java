package hello;

public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=1; i<1001; i++) {
			for(int a=1; a<1001; a++) {
				if(i%a==0)
					count++;
				if (count > 3) 
					break; 
			}
			if(count == 2) 
				System.out.print(i+" ");
			count = 0;

	}

	
}
}
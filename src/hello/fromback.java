package hello;

public class fromback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int s []= new int[10];
		
		for(int i=0;i<s.length;i++) {
			
			s[i]=i;
		}
	
	
		int b []= new int[10];
		for(int i=0;i<b.length;i++)
		{
			
			b[i]=9-i;
		}
		
		
		for(int i=0;i<s.length;i++)
		{
			
			System.out.print(s[i]+" ");
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			
			System.out.print(b[i]+" ");
		}
	
	
	}
	
	
	

}

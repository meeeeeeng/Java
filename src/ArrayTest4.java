
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] s= new int [20];
		
		s[0]=1;
		s[1]=1;
		
		int j = 1;
		
		for(int i=2;i<s.length;i++,j++) {
			s[i]=s[i-1]+s[j];
			
		}
		
		for(int i=1;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}

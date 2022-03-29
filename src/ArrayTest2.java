

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s= new int [10];
		
		for(int i=0;i<s.length;i++) {
			s[i]=9-i;//s[9-i]=i , i=s.length
			
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		

	}

}

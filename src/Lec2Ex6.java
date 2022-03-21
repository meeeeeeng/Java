
public class Lec2Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int lit=0;
		int i=0,j=0;
		
		for(i=0;i<s.length;i++){
		
			if(s[i]<s[++i]) {
				lit=s[i];
				
			
			//for(j=0;j<s.length;j++)
				
				
				System.out.println(lit+"ÀÌ ÃÖ¼Ú°ª!");
			}
			
			
		}
			
	}

}

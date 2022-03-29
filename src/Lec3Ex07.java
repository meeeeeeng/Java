import java.util.Scanner; // scanner 클래스 포함

public class Lec3Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner input = new Scanner(System.in);
		int in=0;
		int s[]= {0,11,18,29,35,49,62,68,73,88,100};
		int i=0;
		int min=0;
		int max=0;
		int cha1=0;
		int cha2=0;
		int temp1=100;
		int temp2=100;
		
		System.out.print("숫자를 입력하시오: ");
		in=input.nextInt();
		
		
		for(i=0;i<s.length;i++) {
			if(s[i]<in) {
				cha1=in-s[i];
				
				if(temp1>cha1) {	
					min=s[i];
					//break;
			 }		
				else {
					temp1=cha1;
				}
			}	
			if (s[i]>in) {
				cha2=s[i]-in;
				if(temp2>cha2) {	
					max=s[i];
					break;
				}
				else {
					temp2=cha2;
				}
			}
			else if (s[i]==in) {
				
				max=s[i];
			}
				
				
	
			
		}
				System.out.println(in+"은 "+min+"보다 크고 "+max+"보다 작습니다.");
				
		
			
	}	
}


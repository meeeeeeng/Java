
//import java.util.Scanner;

public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner input = new Scanner(System.in);
		
		
		int i;
		int j;
		int count = 0;
		
		System.out.print("1-1000���� �Ҽ� :  ");
		
        for(i=2; i<=1000; i++) // 1�� �Ҽ��� �ƴϱ� ������ 2���� ����
        {
            for(j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      count ++;
                 }    
            }
            
            
            if(count==1)
            {
                 System.out.print(i+" ");
            }
            count=0;
        }


	}
}	
		
		
		
	



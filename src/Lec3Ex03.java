
public class Lec3Ex03 {

	public static void main(String[] args) {
		
				
				
		int count=0;

        for(int i=2; i<=1000; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      count ++;
                 }    
            }
            
            // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
            if(count==1)
            {
                 System.out.print(i+" ");
            }
            count=0;
        }


					
	}
	
				
}
import java.util.*;

public class midterm01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		
		int x,y;
		double n,d;
		
		System.out.print("사각형의 가로를 입력하시오 : ");
		x=input.nextInt();
		
		System.out.print("사각형의 세로를 입력하시오 : ");
		y=input.nextInt();
		
		
		n=x*y;
		System.out.println("사각형의 넓이는 "+n+"입니다.");
		
		d=(x+y)*2;
		System.out.println("사각형의 넓이는 "+d+"입니다.");
		
	}

}

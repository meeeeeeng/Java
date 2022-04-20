package hello;

public class safeArrays {

	
	private int a[];
	public int length;
	
	public safeArrays(int size) {
		
		this.a=new int[size]; //a[3]
		this.length=size;//3
			
	} 
	
	
	
	
	public int get(int index) {
		
		if(index>=0&&index<length) {
			return a[index];
		}
		return -1;
	}
	
	public void put(int index,int value) {
		
		if(index>=0&&index<length) {
			a[index]=value;
		}
		else
			System.out.println("잘못된 인덱스 "+index);
	}
}

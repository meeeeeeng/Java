package hello;

public class Box {

	
	
	public int width;
	public int length;
	public int height;
	
	public Box(int w,int i,int h)
	{
		
		this.width=w;
		this.length=i;
		this.height=h;
		
	}
	
	
	public boolean isSameBox(Box obj) {
		if(this.width==obj.width&&this.length==obj.length&&this.height==obj.height)
			return true;
		else 
			return false;
		
		
	}
	
}

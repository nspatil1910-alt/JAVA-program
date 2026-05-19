public class SwapNumbers{
	
	public static void main(String[] args){
		
		int a=4;
		int b=7;
		
		System.out.println("Before  Swapping,a is " + a + " and b is " + b);
		
		a=a + b;
		b=a - b;
		a=a - b;
		
		System.out.println("After Swapping, a is " + a + " and b is " + b);
		
	}
	
}
		
	
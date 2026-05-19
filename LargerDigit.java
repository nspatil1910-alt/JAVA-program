import java.util.*;
class LargerDigit 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three Digit Number");
		int num = sc.nextInt();


		int firstDigit =num/100;
		int lastDigit =num%10;

		if(firstDigit > lastDigit)
		{
			System.out.println("Enter Larger Digit:"+firstDigit);
		}
		else
		{
			System.out.println("Enter Larger Digit:"+lastDigit);

		}
	}
}


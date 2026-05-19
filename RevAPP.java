import java.util.*;
public class RevApp
{
   public static void main(String x[])
   { Scanner xyz  = new Scanner(System.in);
     int no;
	 System.out.println("Enter number from keyboard");
	 no=xyz.nextInt();
	 System.out.printf("Number before reverse %d\n",no);
	 no = (no%10)*100+((no/10)%10)*10+(no/100);
	 System.out.printf("Number after reverse %d\n",no);
   }
}

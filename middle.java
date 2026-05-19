import javas util.Scanner;
public class middle
{
public static void main(String[] args)
{
int p, q , r, temp;
Scanner sc= new Scanner (System.in);

System.out.println("Enter the first number:");
p = sc.nextInt();
System.out.println("Enter the second number:");
q = sc.nextInt();
System.out.println("Enter the third number:");
r = sc.nextInt();

int middle =(p > q)
            ?((q > r)?q:(p > r ? r : q))
			:((p > r)?p:(q > r ? r : q));
			
System.out.println("Enter the middle " + middle);
}
}

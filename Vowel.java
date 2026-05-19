import java.util.*;
public class Vowel
{
public static void main(String[] args)
{
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter Alphabet");
char ch = sc.next().charAt(0);
if(char ch >= 'A'& ch <= 'Z')
{
	System.out.println("Vowel");
}
else
{
	System.out.println("Not Vowel");
}

}
}




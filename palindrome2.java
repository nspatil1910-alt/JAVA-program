/*Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
Explanation:
 A spalindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.*/
 
 import java.util.Scanner;
 public class palindrome2
 {
	 public static void main(String [] args)
	 {
		 Scanner sc =new Scanner(System.in);
		 int a[] ={1,2,3,2,1};
		 boolean palindrome = true;
	      for(int i=0;i<a.length/2;i++)
		  {
            if(a[i] != a[a.length - 1 - i])
            {
			palindrome=false;
			break;
	        }
		  System.out.println(palindrome);
        }
    }			 
 }		 
 
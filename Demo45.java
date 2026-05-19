/*Question 45: The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
Input Format
·        The first line will contain TT - the number of test cases. Then the test cases follow.
·        The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
Constraints
1<=T<=100
1<X<Y<=100
Input
30 65

Output
FIRST

Explanation
30 < 65 ? First cab is cheaper

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class Demo45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        int distance = sc.nextInt();

        System.out.print("Enter rate of Cab A per km: ");
        int rateA = sc.nextInt();

        System.out.print("Enter rate of Cab B per km: ");
        int rateB = sc.nextInt();

        int costA = distance * rateA;
        int costB = distance * rateB;

        if (costA < costB) {
            System.out.println("Cab A is cheaper");
        } else if (costB < costA) {
            System.out.println("Cab B is cheaper");
        } else {
            System.out.println("Both cabs cost the same");
        }
    }
}
/*output
 C:\Users\sanja\OneDrive\Desktop\question\DecisionMakingStatement>java Demo45.java
Enter distance: 1950
Enter rate of Cab A per km: 30
Enter rate of Cab B per km: 65
Cab A is cheaper
 */
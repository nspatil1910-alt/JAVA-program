/*Question 33: There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time.
 JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR never remains empty as when the last k candies are left.
  JAR is refilled with new candies in such a way that JAR gets full.
Write a code to implement the above scenario. Display JAR at the counter with the available number of candies. 
Input should be the number of candies one customer can order at a point of time. Update the JAR after each purchase and display JAR at Counter.
Output should give the number of Candies sold and the updated number of Candies in JAR. If Input is more than candies in JAR, return: “INVALID INPUT”.
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
Example 1
Input:
Customer orders 3 candies

Output:
NUMBER OF CANDIES SOLD: 3
NUMBER OF CANDIES AVAILABLE: 7
Explanation:
10 – 3 = 7 candies left. Since 7 > 5, jar is not refilled.

Example 2
Input:
Customer orders 0 candies

Output:
INVALID INPUT
NUMBER OF CANDIES LEFT: 10

Explanation:
Order must be greater than 0 and less than available candies.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo33{
    public static void main(String[] args){
        Scanner sc = new Scanner(Syatem.in);

        int N, k, M;

        System.out.print("Enter jar capacity: ");
        N = sc.nextInt();

        System.out.print("Enter refill limit (k): ");
        k = sc.nextInt();

        M = N; 

        while (true) {
            System.out.println("Current candies in jar: " + M);

            System.out.print("Enter candies taken by customer: ");
            int taken = sc.nextInt();

            if (taken > M) {
                System.out.println("Not enough candies!");
                continue;
            }

            M = M - taken;

        
            if (M <= k) {
                System.out.println("Jar is refilling...");
                M = N;
            }

            System.out.println("Candies left: " + M);

            System.out.print("Continue? (yes=1 / no=0): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
        }


    }
}

/*Question 42: Employee salary hike based on performance and years of service:
? Input: Basic salary, Years of service, Performance rating (1–5)
? Logic:
? If rating >= 4 and service > 5 yrs ? 20% hike
? Else if rating >= 3 ? 10%
? Else ? 5%
? Output: New salary.
Input
Basic Salary
Years of Service
Performance Rating (1–5)

Example Input:
Basic Salary = 30000
Years of Service = 6
Rating = 4

Logic
If rating ? 4 and service > 5 years ? 20% hike
Else if rating ? 3 ? 10% hike
Else ? 5% hike

Output
New Salary = 36000

Explanation
Since rating is 4 and service is more than 5 years, employee gets 20% hike.
20% of 30000 = 6000
New Salary = 30000 + 6000 = 36000

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;

public class Demo42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter performance rating (1 to 5): ");
        int rating = sc.nextInt();

        double hike = 0;

        if (rating == 5) {
            hike = salary * 0.20;
        } else if (rating == 4) {
            hike = salary * 0.15;
        } else if (rating == 3) {
            hike = salary * 0.10;
        } else if (rating == 2) {
            hike = salary * 0.05;
        } else if (rating == 1) {
            hike = 0;
        } else {
            System.out.println("Invalid rating!");
            return;
        }

        double newSalary = salary + hike;

        System.out.println("Hike amount: " + hike);
        System.out.println("New salary: " + newSalary);
    }
}
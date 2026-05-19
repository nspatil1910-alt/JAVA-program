/*Question 25: Write a java program to find the total number of notes in a given amount.
Input:
Amount = 2528

Output
500 = 5
100 = 0
50 = 0
20 = 1
10 = 0
5 = 1
2 = 1
1 = 1

Explanation:
The amount is divided starting from the highest denomination to the lowest to calculate the number of notes.

Asked In Companies:
Just Practice assignment*/

import java.util.Scanner;
public class Demo25{
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter amount Number");
         int amount = sc.nextInt();
         int notes[]={500,100,50,20,10,5,2,1};
          int i=0;
         while(i<notes.length){
            if(amount>=notes[i]){
                int count = amount / notes[i];
                System.out.println(notes[i]+"="+count);
                amount = amount % notes[i];
            }
            i++;
         }

    }
}
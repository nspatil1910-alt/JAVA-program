/*Q62. Write a java program to print this pattern.                                                  
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****

*/
import java.util.Scanner;
public class Demo62{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j<=6-i|| j>=4+i){
                    System.out.printf("*  ");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

        for(int i=1;i<=5;i++){
           for(int j=1;j<=10;j++){
                if(j<=i||j>10-i){     
                System.out.print("*  ");
                }
                else{
                    System.out.print(" ");
                }
             }
             System.out.printtf("\t");

    }
}

}






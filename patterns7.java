

import java.util.Scanner;
public class patterns7{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     for(int i=1;i<=9;i++){
        for(int j=1;j<=9;j++){
            if(j>=6-i && j<=4+i && i<=5){
            System.out.printf("*");
}
      else if(j>=i-4 && j<=14-i && i>=6){
        System.out.printf("*");
      }
      else{
        System.out.printf(" ");
      }
    }  
      System.out.printf("\n");
     
    }
}
}

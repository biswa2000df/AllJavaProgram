package StarPattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Star5 {



         /* *****
             ****
              ***
               **
                *    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int no = sc.nextInt();
        for(int i=0;i<=no;i++){
            for(int k = no;k>no-i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<no-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

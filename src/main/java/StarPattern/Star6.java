package StarPattern;


import java.util.Scanner;


public class Star6 {

/*      *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *           */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int no = sc.nextInt();
        for(int i = 0;i<no;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0;i<no;i++){
            for(int j=1;j<no-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

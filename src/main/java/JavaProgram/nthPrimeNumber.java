package JavaProgram;

import java.util.Scanner;

public class nthPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
        int nthNumber = sc.nextInt();

        int count = 0, no = 1, i;
        while(count<nthNumber){
            no = no + 1;

            for( i = 2;i<=no; i++){
                if(no % i == 0){
                    break;
                }
            }
            if(i == no)
                count = count+1;

        }
        System.out.println("The " +nthNumber +"th prime number is: " + no);


    }
}

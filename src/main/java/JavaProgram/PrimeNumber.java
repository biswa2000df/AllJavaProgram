package JavaProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
       /* Scanner sc = new Scanner(System.in);
        int no = 17;
        boolean flag = false;
        for(int i=1;i<no/2;i++) {
            if (i == 1) {
                continue;
            } else {
                if (no % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Not a Prime Number");
        else
            System.out.println("Prime Number");*/

        Scanner sc = new Scanner(System.in);
        int no = 17;

        if(isPrimeNum(no))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    public static boolean isPrimeNum(int num){
        if(num == 1)
        return false;

        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for(int i=2;i<num;i++){
            if(num%i == 0){
                primeList.add(i);
            }
        }
        return primeList.isEmpty();
    }

}

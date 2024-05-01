package JavaProgram;

import java.util.ArrayList;

public class PalindromeNumber {

    public static void main(String[] args) {

     /*   int no = 121;
        int temp = no;
        int sum = 0;
        int rem = 0;

        while(temp>0){
            rem = temp%10;
            sum = 10 * sum + rem;
            temp = temp/10;
        }

        if(sum == no)
            System.out.println("palindrom number");
        else
            System.out.println("not palindrom number");*/


        int no = 122;
        if(isPalindrom(no))
            System.out.println("Palindrom number");
        else
            System.out.println("Not Palindrom number");



    }

    public static boolean isPalindrom(int num){
        ArrayList<Integer> palindromNumber = new ArrayList<Integer>();
        int temp = num;
        int rem = 0;
        while(temp>0){
            rem = temp % 10;
            palindromNumber.add(rem);
            temp = temp/10;
        }

        int rev = 0;
        for(int digit:palindromNumber){
            rev = rev * 10 + digit;
        }

        return rev == num;

    }
}

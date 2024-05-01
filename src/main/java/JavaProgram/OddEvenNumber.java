package JavaProgram;

import java.util.ArrayList;

public class OddEvenNumber {


    public static void main(String[] args) {


        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();

        for(int i=1; i<=100; i++){
            if(i%2 == 0)
                evenNumber.add(i);
            else
                oddNumber.add(i);
        }

        System.out.println("Even Number = " + evenNumber);
        System.out.println("Odd Number  = " + oddNumber);




    }


}

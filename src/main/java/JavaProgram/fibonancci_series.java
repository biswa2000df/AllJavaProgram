package JavaProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonancci_series {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int no = sc.nextInt();
      /*  int a = 0;
        int b = 1;
        System.out.print(a + " " + b +" ");
        int c = 0;
        while(no > 2){
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            no--;
        }*/


        ArrayList<Integer> fibonancci = new ArrayList<Integer>();

        fibonancci.add(0);
        fibonancci.add(1);

        for(int i = 0; i<no-2; i++){
            fibonancci.add(fibonancci.get(i) + fibonancci.get(i+1));
        }

        for(int fibNo: fibonancci){
            System.out.print(fibNo + " ");
        }

    }

}

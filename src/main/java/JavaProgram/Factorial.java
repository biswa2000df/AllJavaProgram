package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static void main(String[] args) {


       /* int no = 5;
        int fact = 1;
        for(int i = 1;i<=no; i++){
          fact = fact * i;
        }
        System.out.println(fact);*/
        int no = 5;
        List<Integer> factorial = calculateFactorial(no);
        System.out.println(factorial.get(no-1));

    }

    public static List<Integer> calculateFactorial(int no){
        ArrayList<Integer> factorial = new ArrayList<>();

        int fact = 1;
        for(int i=1;i<=no;i++){
            fact *= i;
            factorial.add(fact);
        }
        return factorial;
    }
}

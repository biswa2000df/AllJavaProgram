package JavaProgram;

import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int no = random.nextInt(50);
        System.out.println(no);
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());



    }

}

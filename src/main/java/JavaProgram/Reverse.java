package JavaProgram;

public class Reverse {

    public static void main(String[] args) {
        int no = 234;
        int rev = 0;
        int rem = 0;
        while(no>0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no/=10;
        }
        System.out.println("Reverse number are " + rev);
    }
}

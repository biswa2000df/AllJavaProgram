package JavaProgram;

public class LargestofThreeNumber {

    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        if(a>b || a>c)
            System.out.println("a is big");
        else if(b>c)
            System.out.println("b is big");
        else
            System.out.println("c is big");
    }

}

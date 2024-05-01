package JavaProgram;

public class SmallestOfThreeNumberUsingTernaryOperator {

    //syntax for ternary operator
    //variable_name = (expression) ? value if true:value if false
    public static void main(String[] args) {

        int a = 5, b = 6, c = 7;

        int temp = 0;

        int smallest = 0;

        temp = a<b? a:b;

        smallest = c<temp? c:temp;

        System.out.println(smallest);

    }
}

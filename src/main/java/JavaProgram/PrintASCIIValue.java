package JavaProgram;

public class PrintASCIIValue {


    public static void main(String[] args) {

        char ch = 'a';
        char ch1 = 'b';
        int asciiValue1 = ch;
        int asciiValue2 = ch1;
        System.out.println(asciiValue1 + "   " + asciiValue2);

        int asciivalue3 = 'A';
        int asciivalue4 = 'B';
        System.out.println(asciivalue3 + "   " + asciivalue4);

        for(int i = 0; i<=255; i++){
            System.out.println("The ASCII Value of " + (char)i + " = " + i);
        }

        //65 to 90 A-Z
        //97 to 122 a-z


    }


}

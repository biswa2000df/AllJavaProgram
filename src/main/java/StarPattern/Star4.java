package StarPattern;

public class Star4 {
    /*      *****
            ****
            ***
            **
            *         */

    public static void main(String[] args) {

        int no = 5;

        for(int i=0;i<=no;i++){
            for(int j =0;j<no-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


}

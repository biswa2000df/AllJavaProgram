package StarPattern;

public class Star1 {

    /*

     *
     * *
     * * *
     * * * *

     */

    public static void main(String[] args) {
        int no = 5;
        for(int i=0;i<no; i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}

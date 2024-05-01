package StarPattern;

public class Star9 {

/*      ****
        *   *
        *   *
        *   *
        *****
        *   *
        *   *
        *   *
        *   *  */


    public static void main(String[] args) {

        int no = 9;
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < 5; j++) {
               if(i == 0){
                   if(j<4)
                   System.out.print("*");
               }
                else if( i == 4){
                    System.out.print("*");
                }
                else if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}

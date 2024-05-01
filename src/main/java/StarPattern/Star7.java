package StarPattern;

public class Star7 {


     /*     *
           **
          ***
         ****
        *****
         ****
          ***
           **
            *     */

    public static void main(String[] args) {
        int no = 5;
        for(int i=1;i<=no;i++){
            for(int k=0;k<no-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i<no;i++){
            for (int k=no;k>no-i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<no-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

package StarPattern;

public class Star2 {

    public static void main(String[] args) {
     /*
              *
            * *
          * * *
        * * * *
      * * * * *

       */


        int no = 5;
        for(int i=1; i<=no;i++){
            for(int k = 0;k<no-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

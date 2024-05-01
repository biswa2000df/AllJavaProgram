package StarPattern;

public class Star10 {

    /*          *
              *   *
            *       *
          *           *
        *               *
      **********************/

    public static void main(String[] args) {


        int no = 9;
        for(int i=1; i<=no;i++){
            for(int k = 0;k<no-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                if(i == no){
                    System.out.print("*");
                }
                else if(j==1 || j==i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}

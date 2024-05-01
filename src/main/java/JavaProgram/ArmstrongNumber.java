package JavaProgram;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int no = 153;

        int temp = no;

        int count = 0;

        while(temp>0){
           count++;
           temp = temp/10;
        }

        temp = no;

        int rem = 0;
        int armNum = 0;
        while(temp>0){
            rem = temp % 10;
            armNum = armNum + (int)Math.pow(rem,count);
            temp/=10;
        }

        if(armNum == no)
            System.out.println("Armstrong number");
        else
            System.out.println("not an Armstrong Number");



    }

}

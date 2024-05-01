package JavaProgram;

public class ObjectComparision {

    public  ObjectComparision(int no){

    }

    public static void main(String[] args) {



        ObjectComparision ll = new ObjectComparision(15);
        ObjectComparision kk = new ObjectComparision(20);

        System.out.println(ll.equals(kk));
        System.out.println(kk.equals(20));




    }

}

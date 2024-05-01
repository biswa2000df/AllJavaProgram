package JavaProgram;

import java.util.ArrayList;

public class copyOneArrayToAnother {

    public static void main(String[] args) {

        int arr[] = new int[5];
       // System.out.println(arr.length);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        int arr1[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }


        System.out.println();

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        ArrayList<Integer> al1 = new ArrayList<>();

        al1.addAll(al);

        System.out.println(al);
        System.out.println(al1);

        al1.removeAll(al);
        System.out.println(al1);
        al1 = new ArrayList<>(al);
        System.out.println(al1);




    }

}

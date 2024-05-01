package JavaProgram;

import java.util.ArrayList;

public class OddEvenNumberAnArray {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};

        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> EvenNumber = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0)
                EvenNumber.add(arr[i]);
            else
                oddNumber.add(arr[i]);
        }

        System.out.println(oddNumber);
        System.out.println(EvenNumber);
    }


}

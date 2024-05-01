package JavaProgram;

import java.util.HashSet;

public class FrequencyofEachElement {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};
        System.out.println(arr.length);
        int arr1[] = new int[10];

        int count;
        HashSet<Integer> uniqueNumber = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            count = 0;
            if(!uniqueNumber.contains(arr[i])) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " repeated " + count);
                uniqueNumber.add(arr[i]);
            }
        }
    }
}

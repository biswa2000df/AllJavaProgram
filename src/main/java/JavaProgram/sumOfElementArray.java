package JavaProgram;

public class sumOfElementArray {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum =sum + arr[i];
        }

        System.out.println("Total sum of element are : " + sum);
    }
}

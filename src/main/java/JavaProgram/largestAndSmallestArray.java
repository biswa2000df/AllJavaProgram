package JavaProgram;

public class largestAndSmallestArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};

        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Largest element into an array : " + arr[arr.length-1]);
        System.out.println("Largest element into an array : " + arr[0]);



    }
}

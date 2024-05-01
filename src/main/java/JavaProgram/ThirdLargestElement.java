package JavaProgram;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};
        int temp;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int j = 0;

        for(int l=arr.length-1; l>=0; l--) {
            if (arr[l] != arr[l - 1]) {
                System.out.println("SecondLargest element : " + arr[l - 1]);
                break;
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != arr[i-1]){
                j++;
            }
            if(j == 2) {
                System.out.println( j+1 + " largest element : " + arr[i - 1]);
                break;
            }
        }

    }
}

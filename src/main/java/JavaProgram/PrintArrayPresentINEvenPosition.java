package JavaProgram;

public class PrintArrayPresentINEvenPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,4,2,6,1,1,4,5,0};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The even position array element are : ");
        for(int i=1; i<arr.length; i=i+2){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The odd position array element are : ");
        for(int i=0; i<arr.length; i=i+2){
            System.out.print(arr[i] + " ");
        }
    }
}

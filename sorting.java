import java.util.*;

public class sorting {

   static int[] sort(int arr[]){

    Arrays.sort(arr);
    return arr;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sorting ob = new sorting();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before soting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
        int arr1[]= new int[n];
        arr1=ob.sort(arr);

        System.out.println("After sorting: ");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    
}

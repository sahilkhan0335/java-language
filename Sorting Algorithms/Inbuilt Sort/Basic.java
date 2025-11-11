import java.util.*;

public class Basic {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2, 10, 15};
       // newinsertionSort(arr);
        Arrays.sort(arr);
     //   Arrays.sort(arr,1,2);
      //  Arrays.sort(arr,Collection.reverseOrder());
        printArr(arr);
    }
}

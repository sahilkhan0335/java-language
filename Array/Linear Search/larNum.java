import java.util.*;

public class larNum {

    public static int largestNumber (int numbers[]) {
        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }   
       System.out.println("Smallest Value Is : " + smallest);     
        return largest;
    }

    public static void main(String args[]) {
     int numbers[] = {2,5,4,9,7,10,12,14,45};
     System.out.println("Largest Value Is : " + largestNumber(numbers));

    }
}
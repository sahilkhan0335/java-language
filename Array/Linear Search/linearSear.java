import java.util.*;

public class linearSear {

    public static int linearSearch( int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
     int numbers[] = {2,5,4,9,7,10,12,14,45};
     int key = 20;
      
      int index = linearSearch(numbers,key);
      if(index == -1) {
        System.out.println("Not Found");
      }else{
        System.out.println("Key is at Index :" + index);
      }

    }
}
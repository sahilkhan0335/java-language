import java.util.*;

public class Swap {
    public static void printHelloWorld() {
        System.out.println("Hello World !");
       
    }
    public static void swap( int a , int b){
         int temp = a;
         a =b;
         b = temp;
          System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void main (String args[]) {
        printHelloWorld();
        // Swap - values exchange
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}
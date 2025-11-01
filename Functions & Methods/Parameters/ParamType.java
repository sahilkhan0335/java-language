import java.util.*;

public class ParamType {
    public static void printHelloWorld() {
        System.out.println("Hello World !");
       
    }

    public static int calculateSum(int num1 , int num2) { // parameters of formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
       
        printHelloWorld(); 
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  calculateSum(a , b); // arguments or actual parameters
        System.out.println(" sum is : " + sum);
        // function call
    }
}
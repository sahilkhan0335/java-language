import java.util.*;

public class FactorialN {
    public static void printHelloWorld() {
        System.out.println("Hello World !");
       
    }

    public static int calculateSum(int num1 , int num2) { // parameters of formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static int factorial (int n ) {
        int f = 1;

        for ( int i =1; i<= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        printHelloWorld(); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  calculateSum(a , b); // arguments or actual parameters
        System.out.println(" sum is : " + sum);
        System.out.println(factorial(4));
    }
}
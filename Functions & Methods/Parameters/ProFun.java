import java.util.*;

public class ProFun {
    public static int calculateSum(int num1 , int num2) { // parameters of formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static int multiply ( int a , int b) {
        int product = a * b;
        return product;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println(" a * b " + prod);
        int sum =  calculateSum(a , b); // arguments or actual parameters
        System.out.println(" sum is : " + sum);
     }
}
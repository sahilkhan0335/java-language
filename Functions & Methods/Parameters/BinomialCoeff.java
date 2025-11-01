import java.util.*;

public class BinomialCoeff {
    // Print Message
    public static void printHelloWorld() {
        System.out.println("Welcome Function And Methods"); 
    }
     // Cal Two Number Sum
    public static int calculateSum(int num1 , int num2) { // parameters of formal parameters
        int sum = num1 + num2;
        return sum;
    }
    // Factorial N Number
    public static int factorial (int n ) {
        int f = 1;

        for ( int i =1; i<= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }
    // Bin Coeff 
    public static int bincoeff (int n , int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;

    }
   // Call All Fuction 
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        printHelloWorld(); 
         System.out.print(" Enter A Number : ");
        int a = sc.nextInt();
        System.out.print(" Enter B Number : ");
        int b = sc.nextInt();
        System.out.println(" Enter A Number : ");
        int sum =  calculateSum(a , b); // arguments or actual parameters
        System.out.println("Sum is  Two Number : " + sum);
        System.out.println("Factorial Output : " + factorial(4));
        System.out.println("Binomial Coefficient Output : " + bincoeff(5,2));
    }
}
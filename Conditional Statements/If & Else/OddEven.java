import java.util.*;

public class OddEven {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter A Number :" + number);
        if (number % 2 == 0){
               System.out.println( "This Is A Even Number" );
        }else{
             System.out.println("This IS A Odd Number");
        }
   
    }
}
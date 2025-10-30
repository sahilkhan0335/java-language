import java.util.Scanner;

public class NaturalNum {
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            sum++;
        }
        System.out.println("Print SK 10x");
    }
}


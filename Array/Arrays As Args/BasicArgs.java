import java.util.*;

public class BasicArgs {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] - 10;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97,87,99};
        update(marks);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
         System.out.println();
    }
}
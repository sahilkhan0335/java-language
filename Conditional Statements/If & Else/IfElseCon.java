public class IfElseCon {
    public static void main(String arge[]) {
        int  age = 13;
        if(age >= 18) {
             System.out.println("Adult : Drive, Vote" );
        }
        else if( age >= 13 && age <18 ) {
                System.out.println("Tennager");
        }
        else {
              System.out.println("Child") ;
        }
    
    }
}
/**
 * This is a simple Java program.
 */

 public class Hello {

    public static int returnAnswerToEverything() {
        return 42;
    }
    
    // main entry point
     public static void main(String[] args) {
        System.out.println("Double");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("Float:");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(returnAnswerToEverything());
     }
 }
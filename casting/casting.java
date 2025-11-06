package casting ;

public class casting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit casting (int to double): " + doubleValue);

        // Explicit casting (narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit casting (double to int): " + anotherIntValue);
    }




}
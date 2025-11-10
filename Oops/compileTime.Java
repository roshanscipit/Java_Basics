package Oops;

public class compileTime {
    public static void main(String[] args) {

        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;}

        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of doubles: " + add(5.5, 10));
        
    }
}
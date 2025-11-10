package Oops;

class Calculator {
    // Method overloading (compile-time polymorphism)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void displayContact(String name, String phone) {
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}

class phonebook extends Calculator{
    // Method overriding (runtime polymorphism)
    @Override
    public void displayContact(String name, String phone) {
        System.out.println("Name: " + name + ", Phone: " + phone);
    }
}

public class polymorphism {

    public static void main(String[] args) {
        // compile time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));

        // runtime polymorphism
        phonebook pb = new phonebook();
        pb.displayContact("Alice", "123-456-7890");
        pb.add(5, 10);
        pb.add(5.5, 10.5);

        Calculator polyCalc = new phonebook();
        polyCalc.displayContact("Bob", "098-765-4321");
        polyCalc.add(5, 10);
        polyCalc.add(5.5, 10.5);    
    }
    
}

package Variable;

abstract class AbstractVariable {
    abstract void display();
    // This abstract class can be extended for further variable manipulations
}

class ConcreteVariable extends AbstractVariable {
    
    void display() {
        System.out.println("This is a concrete implementation of AbstractVariable.");
    }
}

class VariableDemo {
    static int staticVariable = 100;
    final String finalVariable = "I am final";
    final int finalIntVariable;

    VariableDemo() {
        finalIntVariable = 200; // Final variable initialized in constructor
    }

    //finalIntVariable = 300; // This would cause a compilation error if uncommented

    public static void showStaticVariable() {
        System.out.println("Static Variable: " + staticVariable);
    }
}

public class Variable {
    public static void main(String[] args) {
        // Demonstrating abstract class and its concrete implementation
        AbstractVariable variable = new ConcreteVariable();
        variable.display();

        // Demonstrating static and final variables
        VariableDemo.showStaticVariable();
        VariableDemo demo = new VariableDemo();
        System.out.println("Final Variable: " + demo.finalVariable);
    }
}
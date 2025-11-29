package DesignPattern;

interface stategry {
    int execute(int a, int b);
}

class Addition implements stategry {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class subtraction implements stategry {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class multiplication implements stategry {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

class Context {
    private stategry strategy;

    public Context(stategry strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

public class statergy {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new subtraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new multiplication());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}   
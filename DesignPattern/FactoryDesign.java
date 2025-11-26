package DesignPattern;

public interface product{
    void show();
}

class concreteProductA implements product{

    @Override
    public void show() {
        System.out.println("This is product A");
    }
    
}

class concreteProductB implements product{

    @Override
    public void show() {
        System.out.println("This is product B");
    }
    
}


public abstract class Factory {
    public abstract product createProduct(String type);
}

public class concreteFactory extends Factory{

    @Override
    public product createProduct(String type) {
        if(type.equalsIgnoreCase("A")){
            return new concreteProductA();
        }else if(type.equalsIgnoreCase("B")){
            return new concreteProductB();
        }
        return null;
    }
    
}   

public class FactoryDesign {

    public static void main(String[] args) {
        Factory factory = new concreteFactory();
        product prodA = factory.createProduct("A");
        prodA.show();

        product prodB = factory.createProduct("B");
        prodB.show();
        
    }
    
}

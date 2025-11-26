package DesignPattern;

public class product{

    private  String name;
    private double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }   

}

public interface productBuilder{
    void buildName();
    void buildPrice();
    product getProduct();
}

public class concreteProductBuilder implements productBuilder{

    private product p;

    public concreteProductBuilder() {
        this.p = new product();
    }

    @Override
    public void buildName() {
        p.setName("Sample Product");
    }

    @Override
    public void buildPrice() {
        p.setPrice(99.99);
    }

    @Override
    public product getProduct() {
        return this.p;
    }
}

public class director{
    private productBuilder builder;

    public director(productBuilder builder) {
        this.builder = builder;
    }
    

    public product construct(){
        builder.buildName();
        builder.buildPrice();
        return builder.getProduct();
    }
}

class Builder {
    public static void main(String[] args) {
        productBuilder builder = new concreteProductBuilder();
        director director = new director(builder);
        product p = director.construct();

        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
    }
}
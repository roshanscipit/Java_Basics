package Oops;

class father {
    void show() {
        System.out.println("Father's class");
    }
}

class child extends father {
    void display() {
        System.out.println("Child's class");
    }
}

public class inheritence {

    public static void main(String[] args) {

        father f =new father();
        f.show();
        child c = new child();
        c.show();
        c.display();
    }
    
}

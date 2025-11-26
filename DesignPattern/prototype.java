interface shape{
    shape clone();
}

class circle implements shape{
    int radius;

    circle(int r){
        this.radius = r;
    }

    @Override
    public shape clone() {
        return new circle(this.radius);
    }

    @Override
    public String toString() {
        return "circle with radius: " + this.radius;
    }
}

class rectangle implements shape{
    int length;
    int breadth;

    rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    @Override
    public shape clone() {
        return new rectangle(this.length, this.breadth);
    }

    @Override
    public String toString() {
        return "rectangle with length: " + this.length + " and breadth: " + this.breadth;
    }
}

public class prototype {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        circle c2 = (circle) c1.clone();

        rectangle r1 = new rectangle(10, 20);
        rectangle r2 = (rectangle) r1.clone();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
package DesignPattern;

interface square{
    void draw();
}

class rectangle{
    void drawRectangle()
    {
        System.out.println("drawing rectangle");
    }
}

class rectanagleAdapter implements square{
    rectangle rect;

    rectanagleAdapter(rectangle rect)
    {
        this.rect = rect;
    }

    @Override
    public void draw() {
        rect.drawRectangle();
    }
}

public class Adpater {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        square s = new rectanagleAdapter(rec);
        System.out.println("drawing square using adapter:");
        s.draw();
    }
}
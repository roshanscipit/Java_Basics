package DesignPattern;

interface image{
    void display();
}

class realImage implements image{
    private String fileName;

    public realImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

class proxyImage implements image{
    private realImage realImage;
    private String fileName;

    public proxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new realImage(fileName);
        }
        realImage.display();
    }
}

public class proxy {
    public static void main(String[] args) {
        image image = new proxyImage("test_image.jpg");

        // Image will be loaded from disk
        image.display();

        // Image will not be loaded from disk
        image.display();
    }
}   
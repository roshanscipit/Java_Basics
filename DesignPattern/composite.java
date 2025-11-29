package DesignPattern;

interface fileecosystem{
    void showDetails();
}

class file implements fileecosystem{
    String name;
    int size;

    file(String name, int size)
    {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " Size: " + size + "KB");
    }
}

class directory implements fileecosystem{
    String name;
    List<fileecosystem> children;

    directory(String name)
    {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(fileecosystem component)
    {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for(fileecosystem component : children)
        {
            component.showDetails();
        }
    }
}

public class composite {
    public static void main(String[] args) {
        fileecosystem file1 = new file("file1.txt", 100);
        fileecosystem file2 = new file("file2.txt", 200);

        directory dir1 = new directory("Documents");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        fileecosystem file3 = new file("file3.txt", 300);
        directory dir2 = new directory("Downloads");
        dir2.addComponent(file3);
        dir2.addComponent(dir1); // nested directory

        System.out.println("File System Structure:");
        dir2.showDetails();
    }
}
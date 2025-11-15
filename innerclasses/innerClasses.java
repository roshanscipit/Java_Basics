package innerclasses;

class animal{

    String dog ="bondu";

    class dog{

        void display(){
        System.out.println("dog name is: "+dog);
        }
    }
}

public class innerClasses{
  void main(String[] args) {

        animal a1=new animal();
        animal.dog d1=a1.new dog();
        d1.display();

    }
}
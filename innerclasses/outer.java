package innerclasses;

class man{

    public static String name ="lion";

    static class child{
        public void display(){
            System.out.println("dog name is: "+name);
        }
    }

}
public class outer {

    public static void main(String[] args) {
      man.child d1 = new man.child();
      d1.display();
    
}
}

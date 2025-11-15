package Keywords;

public class thisclass {

    int id;
    String name;

    thisclass(int id,String name){
        this.id = id;
        this.name = name;
    }

    thisclass()
    {
        this(0,"");
    }


    public static void main(String[] args) {

        thisclass obj = new thisclass(1,"example");
        System.out.println("ID: " + obj.id + ", Name: " + obj.name);    
        
    }
    
}

package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

 class company{

    String name;

    public company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("company name is: "+name);
    }



}
public class reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        company c1=new company("abc");
        c1.show();

        Field nameFiedd = company.class.getDeclaredField("name");
        nameFiedd.setAccessible(true);
        nameFiedd.set(c1, "xyz");

        Method methodName = company.class.getDeclaredMethod("show");
        methodName.setAccessible(true);
        methodName.invoke(c1);

       
    }
    
}

package Exception;
public class CustomException{
    public static void main(String[] args) throws classnotfoundexception
    {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            throw new classnotfoundexception("Custom Exception: Class not found!");
        }
    }
}


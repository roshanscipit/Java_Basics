package Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;


public class internatilztionClass {

    public static void main(String[] args) {

        //internationalization example
        Locale locale = Locale.FRANCE; // Change to Locale.US for English
        try{
            // use package-qualified base name because the properties are in the Date package
            ResourceBundle messages = ResourceBundle.getBundle("Date.Messages", locale);
            String greeting = messages.getString("greeting");
            System.out.println(greeting);}
        catch(MissingResourceException e){
            System.out.println("Resource not found: " + e.getMessage());
        }

    }
    
}
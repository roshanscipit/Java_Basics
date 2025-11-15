package Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex{

    public static void main(String[] args) {

        String a = "abc";
        String text = "\\d+";

        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(a);

        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found.");
        }


        
     


    }

}
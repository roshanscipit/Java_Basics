package Strings;

public class StringOperation {
    public static void main(String[] args) {
       
        //equals() method
        String str1 = "Hello";
        String str2 = "Bye";
        String str3 = "Hello";

        System.out.println("Using equals() method: " + str1.equals(str2)); // false // as this check content of both strings not reference
        System.out.println("Using == method: " + str1 == str2 ); // false // as this check reference of both strings not content

        System.out.println("Using equals() method: " + str1.equals("Hello")); // true
        System.out.println("Using == method: " +( str1==str3)); // false

    }
}

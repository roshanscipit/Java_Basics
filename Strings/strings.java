package Strings;

public class strings{
    public static void main(String[] args) {

        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        String formated = str.format("Formatted String: %s", str);
        System.out.println(formated);

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);

        // Substring
        String subStr = str.substring(7, 12);
        System.out.println("Substring (7 to 12): " + subStr);

        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        //reverse
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);

        String reverseStr2 = new StringBuffer(str).reverse().toString();
        System.out.println("Reversed String using StringBuffer: " + reverseStr2);   

        // Split
        String[] splitStr = str.split(", ");
        System.out.println("Split String:");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // Trim
        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        //check if strings are equal
        String str1 = "Hello";
        String str2 = "Hello"; 
        String str3 = new String("Hello"); 
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }       

        //check with ==
        if (str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        int a =10;
        System.out.println("Value of a: " + a);

        modifyValue(a);

        System.out.println("Value of a after method call: " + a);
    }

    public static void modifyValue(int a)
    {
        a += 10;
        System.out.println("Modified value of a inside method: " + a);
    }
}
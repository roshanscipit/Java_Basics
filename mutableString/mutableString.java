package mutableString;

public class mutableString {
    public static void main(String[] args) {

        //default 16 size
        //thread safe-Multi-thread environment
        StringBuffer mutableString = new StringBuffer("Hello");
        mutableString.append(", World!");
        System.out.println(mutableString.toString());


        //not thread safe-Single-thread environment
        //string builder is faster than string buffer
        StringBuilder mutableStr = new StringBuilder("Hello");
        mutableStr.append(", World!");
        System.out.println(mutableStr.toString());
    }
}

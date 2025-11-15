package Enum;

enum constants {
    //give name and values
    Red,
    GREEN,
    blue

}

public class enumClass {
    public static void main(String[] args) {
        // constants c1 = constants.Red;
        // System.out.println(c1);
        // System.out.println(c1.name());
        // System.out.println(c1.ordinal());
        // System.out.println(constants.values());

        constants c2 = constants.Red;
        constants c3 = constants.GREEN;
        constants c4 = constants.Red;
        constants c5 = constants.blue;

        System.out.println(c2.equals(c3)); // flase
        System.out.println(c2.equals(c4)); // true 
        System.out.println(c2 == c4); // true
        System.out.println(c3 == c5); // false


        
    }
}
    





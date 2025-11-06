package Enum;

enum constants {
    //give name and values
    Red,
    GREEN,
    blue

}

public class enumClass {
    public static void main(String[] args) {
        constants c1 = constants.Red;
        System.out.println(c1);
        System.out.println(c1.name());
        System.out.println(c1.ordinal());
        System.out.println(constants.values());


        
    }
}
    





package String;

public class replace {

    public static void main(String[] args) {
        // Replace

        String Name = "Parth";
        String Name1 = Name.replace('a', '@');

        System.out.println(Name1);

        /*
         * Java String objects are immutable. All replace methods return a new string
         * and do not modify the original one.
         */
    }
}

package Strings;

// import java.util.*;

public class string {

    // sabhi latter ko print karne ke liye yeh function ko use kar rahe hai

    public static void printLatters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("avbdh");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.println(name);

        String firstName = "Bhanu Pratap";
        String lastName = "Nishad";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(4));

        printLatters(fullName);
    }    

}

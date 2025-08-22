package Recursion2;

public class Binary_string {

    public static void printBinaryString(int n, int lastPlace, String str ) {
        // base case 

        if (n == 0 ) {
            System.out.println(str);
            return;
        }

        // kaam 

        printBinaryString(n-1, 0, str+"0");
        
        if(lastPlace == 0) {
            printBinaryString(n-1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        printBinaryString(1, 0, new String());
        
    }
    
}

  import java.util.*;
public class calculatorCode {
    public static void main(String[] args) {
        Scanner nx = new  Scanner(System.in);
        System.out.println("enter a :");
        int a = nx.nextInt();
        System.out.println("enter b : ");
        int b = nx.nextInt();
        System.out.println("enter operator: ");
        char operator = nx.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                         break;
            case  '%' : System.out.println(a%b);
                         break;
            default : System.out.println("wrong operator"); 



        }




    }
    
}

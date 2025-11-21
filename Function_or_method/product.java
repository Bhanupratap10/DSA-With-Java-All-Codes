public class product {
    public static int multiply(int a, int b) {
        int product =  a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 90;
        int b = 89;
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        prod = multiply(10, 28);
        System.out.println("a * b = " + prod);

    }
}

import java.util.*;

public class Product {
    public static int ProductSum(int a, int b) {
        int product = a * b;
        return product;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int product = ProductSum(a, b);
        System.out.println("a*b =" + product);
        product = ProductSum(10, 20);
        System.out.println("a*b =" + product);

    }
}

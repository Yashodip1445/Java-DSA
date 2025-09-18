import java.util.*;

public class calulator {
    public static void main(String[] args) {
        System.out.println("Basic calulator  ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number ");
        double a = sc.nextDouble();

        System.out.println("Enter the Second Number ");
        double b = sc.nextDouble();


        System.out.println("Enter Operator (+ - * /):");
        char op = sc.next().charAt(0);

        double  result = 0;
            switch(op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if (b != 0) result = a / b;
                else System.out.println("Division by zero not allowed!");
                break;
            default: 
                System.out.println("Invalid operator");



    }

}

public class BasicMath {
    public static void main(String[] args) {
        int a = 10, b = -5;
        double x = 3.7, y = 2.3;
        
        // Absolute value
        System.out.println("Math.abs(-5) = " + Math.abs(b));
        
        // Max and Min
        System.out.println("Math.max(10, -5) = " + Math.max(a, b));
        System.out.println("Math.min(3.7, 2.3) = " + Math.min(x, y));
        
        // Power and Square root
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
        
        // Rounding
        System.out.println("Math.round(3.7) = " + Math.round(x));
        System.out.println("Math.ceil(3.2) = " + Math.ceil(3.2));
        System.out.println("Math.floor(3.8) = " + Math.floor(3.8));
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Math class methods
        System.out.println(Math.sqrt(25)); // Square root → 5.0✅

        System.out.println(Math.pow(2, 2)); // Power (2^3) → 8.0✅

        System.out.println(Math.abs(-10)); // Absolute value → 10 ✅

        System.out.println(Math.max(10, 20)); // Max → 20✅

        System.out.println(Math.min(10, 20)); // Min → 10 ✅

        System.out.println(Math.round(5.5)); // Round → 6 ✅

        System.out.println(Math.floor(5.9)); // Floor → 5.0

        System.out.println(Math.ceil(5.1)); // Ceil → 6.0

        System.out.println(Math.random()); // Random between 0.0 to 1.0 ✅

        // Trigonometric Functions

        System.out.println("✅ "); // ❌

        System.out.println(Math.sin(Math.PI / 2)); // sin(90°) → 1.0
        System.out.println(Math.cos(0)); // cos(0°) → 1.0
        System.out.println(Math.tan(Math.PI / 4)); // tan(45°) → ~1.0

        int randomNum = (int) (Math.random() * 100); // 0 to 99
        System.out.println(randomNum);

    }
}
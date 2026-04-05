
import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt(); // wheels
        int B = sc.nextInt(); // bodies
        int C = sc.nextInt(); // chairs

        int carsFromWheels = W / 4;
        int carsFromBodies = B / 1;
        int carsFromChairs = C / 2;1

        int result = Math.min(carsFromWheels,
                       Math.min(carsFromBodies, carsFromChairs));

        System.out.println(result);
    }
}

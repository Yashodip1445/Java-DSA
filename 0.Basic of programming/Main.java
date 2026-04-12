import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int v = 0, i = 0, b = 0, g = 0, y = 0, o = 0, r = 0;

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'V': v++; break;
                case 'I': i++; break;
                case 'B': b++; break;
                case 'G': g++; break;
                case 'Y': y++; break;
                case 'O': o++; break;
                case 'R': r++; break;
            }
        }

        int result = Math.min(
                        Math.min(Math.min(v, i), Math.min(b, g)),
                        Math.min(Math.min(y, o), r)
                    );

        System.out.print(result);
    }
}

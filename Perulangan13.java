import java.util.Scanner;
/**
 * Perulangan13
 */
public class Perulangan13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = input13.next();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        input13.close();
    }
}
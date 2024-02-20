import java.util.Scanner;
/**
 * JarakWaktu
 */
public class JarakWaktu {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int menu = input13.nextInt();

            if (menu == 4) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }

            switch (menu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        }

        input13.close();
    }

    static void hitungKecepatan() {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input13.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan (v): " + kecepatan + " m/s");
    }

    static void hitungJarak() {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input13.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input13.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s): " + jarak + " meter");
    }

    static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu (t): " + waktu + " detik");
    }
}
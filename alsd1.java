import java.util.Scanner;
/**
 * alsd1
 */
public class alsd1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai kuis (0-100): ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();

        if (isValidNilai(nilaiTugas) && isValidNilai(nilaiKuis) && isValidNilai(nilaiUTS) && isValidNilai(nilaiUAS)) {
            double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);

            char nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
            String keterangan = (nilaiHuruf == 'A' || nilaiHuruf == 'B' || nilaiHuruf == 'C') ? "LULUS" : "TIDAK LULUS";

            // Output hasil
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 dan 100.");
        }

        input.close();
    }

    private static boolean isValidNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    private static char konversiNilaiHuruf(double nilai) {
        if (nilai >= 80) {
            return 'A';
        } else if (nilai >= 75) {
            return 'B';
        } else if (nilai >= 70) {
            return 'C';
        } else if (nilai >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
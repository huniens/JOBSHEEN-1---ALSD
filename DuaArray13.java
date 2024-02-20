import java.util.Scanner;
/**
 * DuaArray13
 */
public class DuaArray13 {
    public static void main(String[] args) {
        // Array kode plat mobil
        String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };
        // Array kota yang berpasangan dengan kode plat mobil
        String[][] KOTA = {
            {"Banten", "Tangerang", "Cilegon", "Lebak", "Serang", "Pandeglang"},
            {"Jakarta", "Depok", "Tangerang", "Bekasi"},
            {"Bandung", "Bandung barat", "Cimahi"},
            {"Cirebon", "Indramayu" , "Majalengka", "Kuningan"},
            {"Bogor", "Cianjur", "Sukabumi"},
            {"Brebes", "Pekalongan", "Tegal", "Batang", "Pemalang"},
            {"Semarang" , "Salatiga" , "Kendal" , "Demak"},
            {"Surabaya"},
            {"Malang" , "Probolinggo" , "Lumajang" , "Pasuruan" , "Batu"},
            {"Subang", "Purwakarta", "Karawang"},
        };

        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (huruf saja): ");
        String inputKode = input13.next().toUpperCase(); // Menggunakan .next() untuk membaca satu kata

        int index = -1;
        // Mencari indeks kode plat pada array KODE
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equalsIgnoreCase(inputKode)) { // Menggunakan equalsIgnoreCase untuk membandingkan string
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Kota yang berpasangan dengan kode plat " + inputKode + " adalah:");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.println((i + 1) + ". " + KOTA[index][i]);
            }
        } else {
            System.out.println("Kode plat tidak valid atau tidak ditemukan.");
        }

        input13.close();
    }
}
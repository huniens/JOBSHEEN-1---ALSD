/**
 * Fungsi
 */
public class Fungsi {

    // Pendapatan setiap cabang jika semua bunga habis terjual
    public static void displayBranchRevenue(int[][] stock, int[] hargaBunga) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");

        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * hargaBunga[j];
            }
            System.out.println("Cabang " + (i + 1) + ": " + totalPendapatan);
        }
    }

    // Jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
    public static void displayStockRoyalGarden4(int[][] stock, int[] penguranganStock) {
        System.out.println("\nJumlah stock setiap jenis bunga pada cabang RoyalGarden 4:");

        int cabangIndex = 3; // Indeks cabang RoyalGarden 4

        for (int i = 0; i < stock[cabangIndex].length; i++) {
            int stockBunga = stock[cabangIndex][i] - penguranganStock[i];
            System.out.println("Jumlah " + getNamaBunga(i) + ": " + stockBunga);
        }
    }

    // Mendapatkan nama bunga berdasarkan indeks
    public static String getNamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "Bunga Tidak Dikenal";
        }
    }

    public static void main(String[] args) {
        // Inisialisasi data
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] penguranganStock = {1, 2, 0, 5};

        // Memanggil fungsi untuk menampilkan pendapatan setiap cabang
        displayBranchRevenue(stock, hargaBunga);

        // Memanggil fungsi untuk menampilkan jumlah stock bunga pada cabang RoyalGarden 4
        displayStockRoyalGarden4(stock, penguranganStock);
    }
}
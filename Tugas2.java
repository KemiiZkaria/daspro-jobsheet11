import java.util.Scanner;

public class Tugas2 {
    static int[][] penjualan = new int[5][7];
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanData() {
        for (int j = 0; j < 7; j++) {
            System.out.println("Pada Hari ke-" + (j + 1) + ":");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i] + " terjual sebanyak " + penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + menuTerlaris + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        System.out.println("Rata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputData();

        tampilkanData();

        menuTertinggi();

        rataRataPenjualan();
    }
}

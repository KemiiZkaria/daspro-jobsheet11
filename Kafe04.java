import java.util.Scanner;
public class Kafe04 {
    
    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon sebesar 50%");
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon sebesar 30%");
            hargaTotal *= 0.7;
        } else {
            System.out.println("Invalid");
        }
        return hargaTotal;
    }
    
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappuccino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakar - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true);
        double totalHargaPesanan = 0;
        boolean loop = true;
        while (loop) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo yang anda miliki: ");
            String kode = sc.nextLine();
            
            double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kode);
            totalHargaPesanan += totalHarga;
    
            System.out.println("Total harga untuk pesanan anda: Rp." + totalHarga);

            System.out.print("Apakah ingin melanjutkan pesanan? (y/n): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                loop = false;
            }
        }
        System.out.println("\n===== RINGKASAN PESANAN =====");
        System.out.println("Total harga pesanan anda: Rp." + totalHargaPesanan);
    }
}
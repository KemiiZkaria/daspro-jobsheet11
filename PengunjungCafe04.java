public class PengunjungCafe04 {
    public static void daftarPengunjung(int jumlahPengunjung, String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung(3, "Ali", "Budi", "Citra");
    }
}

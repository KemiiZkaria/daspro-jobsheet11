import java.util.Scanner;

public class Kubus04 {
    public static int volKubus (int panjang, int lebar, int tinggi) {
        int volume = panjang *lebar *tinggi;
        return volume;
    }
    public static int luasPermukaan (int panjang, int lebar) {
        int luasPermukaan = panjang *lebar *6;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = sc.nextInt();

        int vol = volKubus(p, l, t);
        System.out.println("Volume kubus: " + vol);

        int lPermukaan = luasPermukaan(p, l);
        System.out.println("Luas permukaan: " + lPermukaan);
    }
}

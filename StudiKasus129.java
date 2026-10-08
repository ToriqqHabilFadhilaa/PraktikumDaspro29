import java.util.Scanner;

public class StudiKasus129 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;

        System.out.print("Masukkan jumlah cup: ");
        int jumlahCup = input.nextInt();

        System.out.print("Masukkan uang dibayar: Rp ");
        int uangBayar = input.nextInt();

        int totalHarga = jumlahCup * hargaPerCup;

        int diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        int totalBayar = totalHarga - diskon;

        System.out.println("HASIL PEMBAYARAN");
        System.out.println("Total harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            int kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            int kurang = totalBayar - uangBayar;
            System.out.println("Uang kurang : Rp " + kurang);
        }

        input.close();
    }
}
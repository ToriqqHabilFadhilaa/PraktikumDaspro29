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

        System.out.println("Total harga: Rp " + totalHarga);

        input.close();
    }
}
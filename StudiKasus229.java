import java.util.Scanner;

public class StudiKasus229 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        String jenisKegiatan = input.nextLine();

        int jumlahDokumen = 0;
        int peringkat = 0;
        int statusPKM = 0;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            peringkat = input.nextInt();

            System.out.println("HASIL PEMERIKSAAN");
            System.out.println("Nama mahasiswa : " + nama);
            System.out.println("Jenis kegiatan : " + jenisKegiatan);

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                    System.out.println("Alasan : Juara 1, 2, atau 3 dan dokumen lengkap.");
                } else {
                    int kurang = 4 - jumlahDokumen;

                    System.out.println("Status : Dana penghargaan tidak diberikan.");
                    System.out.println("Alasan : Dokumen tidak lengkap.");
                    System.out.println("Dokumen kurang : " + kurang);
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan.");
                System.out.println("Alasan : Hanya Juara 1, 2, atau 3 yang memperoleh dana.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();

            System.out.println("HASIL PEMERIKSAAN");
            System.out.println("Nama mahasiswa : " + nama);
            System.out.println("Jenis kegiatan : " + jenisKegiatan);

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                    System.out.println("Alasan : PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    int kurang = 4 - jumlahDokumen;

                    System.out.println("Status : Dana penghargaan tidak diberikan.");
                    System.out.println("Alasan : Dokumen tidak lengkap.");
                    System.out.println("Dokumen kurang : " + kurang);
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan.");
                System.out.println("Alasan : PKM tidak lolos pendanaan.");
            }

        } else {

            System.out.println("HASIL PEMERIKSAAN");
            System.out.println("Nama mahasiswa : " + nama);
            System.out.println("Jenis kegiatan : " + jenisKegiatan);
            System.out.println("Status : Tidak memperoleh dana penghargaan.");
            System.out.println("Alasan : Jenis kegiatan tidak termasuk ketentuan.");
        }

        input.close();
    }
}
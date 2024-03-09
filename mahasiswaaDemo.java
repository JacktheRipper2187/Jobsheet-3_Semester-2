import java.util.Scanner;
// membuat class mahasiswaDemo untuk menjalankan class mahasiswa
public class mahasiswaaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.println("=====================================");
        mahasiswaa[] arrayMahasiswa = new mahasiswaa[jumlahSiswa]; // membuat array dari class mahasiswa
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i] = new mahasiswaa();
        }
        System.out.println("=====================================");
        System.out.println("Rata-rata IPK: " + arrayMahasiswa[0].rataIPK(jumlahSiswa, arrayMahasiswa));
        System.out.println("=====================================");
    }

}

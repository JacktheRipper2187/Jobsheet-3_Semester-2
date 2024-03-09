import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        int jumlahMahasiswa = Mahasiswa.inputJumlahMahasiswa(scanner);

        // Input data mahasiswa
        Mahasiswa[] arrayMahasiswa = Mahasiswa.inputDataMahasiswa(scanner, jumlahMahasiswa);

        // Menampilkan data mahasiswa
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i].tampilInfo();
        }

        // Menghitung dan menampilkan rata-rata IPK
        double rataRataIPK = Mahasiswa.hitungRataRataIPK(arrayMahasiswa);
        System.out.println("Rata-rata IPK mahasiswa: " + rataRataIPK);

        scanner.close();
    }
}

import java.util.Scanner;

public class info_Mhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        // Deklarasi array untuk menyimpan objek mahasiswa
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.next();
            System.out.print("Masukkan NIM: ");
            String nim = sc.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();

            // Membuat objek Mahasiswa dan menyimpannya dalam array
            arrayMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i].tampilInfo();
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            totalIPK += mahasiswa.getIpk();
        }
        double rataRataIPK = totalIPK / jumlahMahasiswa;

        // Menampilkan rata-rata IPK
        System.out.println("Rata-rata IPK: " + rataRataIPK);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    // Konstruktor
    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    // Getter untuk mendapatkan IPK
    public double getIpk() {
        return ipk;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }
}

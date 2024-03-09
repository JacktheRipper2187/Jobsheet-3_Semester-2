import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    // konstruktor
    public Mahasiswa() {
    }

    // metode input data mahasiswa
    public void inputData(Scanner sc) {
        System.out.print("Masukkan nama: ");
        this.nama = sc.next();
        System.out.print("Masukkan NIM: ");
        this.nim = sc.next();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        this.jenisKelamin = sc.next().charAt(0);
        System.out.print("Masukkan IPK: ");
        this.ipk = sc.nextDouble();
    }

    // mendapatkan IPK
    public double getIpk() {
        return ipk;
    }

    // menampilkan informasi mahasiswa
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("IPK: " + getIpk());
    }

    // untuk menghitung rata-rata IPK
    public static double hitungRataRataIPK(Mahasiswa[] arrayMahasiswa) {
        double totalIPK = 0;
        int jumlahMahasiswa = arrayMahasiswa.length;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            totalIPK += mahasiswa.getIpk();
        }
        return totalIPK / jumlahMahasiswa;
    }

    public static int  inputJumlahMahasiswa(Scanner sc) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        return sc.nextInt();
    }

    public static Mahasiswa[] inputDataMahasiswa(Scanner sc, int jumlahMahasiswa) {
       Mahasiswa[] arrayMahasiswa = new Mahasiswa[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i] = new Mahasiswa();
            arrayMahasiswa[i].inputData(sc);
        }
        return arrayMahasiswa;
    }

    // mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // mendapatkan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // mendapatkan jenis kelamin mahasiswa
    public char getJenisKelamin() {
        return jenisKelamin;
    }

}
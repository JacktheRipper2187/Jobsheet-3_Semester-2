import java.util.Scanner;

// membuat class mahasiswa
public class mahasiswaa {
    public Scanner sc = new Scanner(System.in);
    public String nama;
    public int NIM;
    public String jenisKelamin;
    public float IPK;
    public float totalRataIPK = 0;

// membuat konstruktor default untuk class mahasiswa
    public mahasiswaa() {
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        NIM = sc.nextInt();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = sc.next();
        System.out.print("IPK: ");
        IPK = sc.nextFloat();
    }
    // membuat metode rata-rata IPK
    float rataIPK(int jumlahSiswa, mahasiswaa[] arrayMahasiswa) {
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            totalRataIPK += arrayMahasiswa[i].IPK;
        }
        return totalRataIPK / jumlahSiswa;
    }
}

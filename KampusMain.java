import java.util.Scanner;
public class KampusMain {
 static float rataIpk = 0; 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int jumlah;
       
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();
        sc.nextLine();
        
        Kampus[] dataKampus = new Kampus[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan ipk: ");
            float ipk = Float.parseFloat(sc.nextLine());
            
            dataKampus[i] = new Kampus(nama, nim, jenisKelamin, ipk);
            
            rataIpk += ipk;
        }
        
        int a = 0;
        for (Kampus kampus : dataKampus) {
            System.out.println("| Data Mahasiswa ke-" + (a+1));
            kampus.cetakInfo();
            a++;
        }
        
        rataIpk /= jumlah;
        System.out.println("Rata-rata IPK: " + rataIpk);
    }  
}
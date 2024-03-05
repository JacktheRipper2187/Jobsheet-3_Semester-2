import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        System.out.println("Masukkan panjang dan lebar untuk setiap persegi panjang:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1) + ": ");
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    }
}


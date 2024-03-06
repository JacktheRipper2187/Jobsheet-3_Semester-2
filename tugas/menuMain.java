package tugas;

import java.util.Scanner;
public class menuMain {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenuInput = sc.nextInt();

        // Inisialisasi array of object
        String[] daftarMenuInput = new String[jmlMenuInput];
        int[] hargaMenuInput = new int[jmlMenuInput];
        int[] stokMenuInput = new int[jmlMenuInput];

        for (int i = 0; i < jmlMenuInput; i++) {
            sc.nextLine();
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            daftarMenuInput[i] = sc.nextLine();
            System.out.print("Masukkan harga menu ke-" + (i + 1) + ": ");
            hargaMenuInput[i] = sc.nextInt();
            System.out.print("Masukkan stok menu ke-" + (i + 1) + ": ");
            stokMenuInput[i] = sc.nextInt();
        }

        // Membuat objek FoodMenu
        menu foodMenu = new menu(jmlMenuInput, daftarMenuInput, hargaMenuInput, stokMenuInput);
        foodMenu.tampilMenu();
    }
}
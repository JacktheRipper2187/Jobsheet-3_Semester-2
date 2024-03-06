package tugas;
public class menu {
    public int jmlMenu;
    public String[] daftarMenu;
    public int[] hargaMenu;
    public int[] stokMenu;

    public menu(int jmlMenu, String[] daftarMenu, int[] hargaMenu, int[] stokMenu) {
        this.jmlMenu = jmlMenu;
        this.daftarMenu = daftarMenu;
        this.hargaMenu = hargaMenu;
        this.stokMenu = stokMenu;
    }

    public void tampilMenu() {
        System.out.println("---- Daftar Menu ----:");
        System.out.println("-------------------------------------------------");
        System.out.println("| No |   Makanan         |  Harga   |    Stok   |");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < jmlMenu; i++) {
            System.out.printf("| %-2d | %-17s | %-8d | %-9d |\n", i + 1, daftarMenu[i], hargaMenu[i], stokMenu[i]);
        }
        System.out.println("-------------------------------------------------");
    }
}
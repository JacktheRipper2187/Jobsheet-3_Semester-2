
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public PersegiPanjang() {
        // Tidak perlu ada logika khusus di sini jika tidak diperlukan
    }

    void cetakInfo() {
        System.out.println("Panjang: " + panjang + " Lebar: " + lebar);
    }

   
    public int hitungLuas() {
        return panjang * lebar;
    }

   
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}


      
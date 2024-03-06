public class Kampus {
    public String nama;
    public String nim;
    public String jenisKelamin;
    public float ipk;
    
    public Kampus(String nama, String nim, String jenisKelamin, float ipk){
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public float getIpk(){
        return ipk;
    }
    
    public void cetakInfo(){
        System.out.println("---------------------------------------");
        System.out.println("| Nama          : " +nama);
        System.out.println("| NIM           : " +nim);
        System.out.println("| Jenis Kelamin : " +jenisKelamin);
        System.out.println("| Nilai IPK     : " +ipk);
        System.out.println("---------------------------------------");
    }
}
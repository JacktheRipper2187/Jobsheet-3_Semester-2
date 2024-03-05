public class Motor {
    private String merk;
    private String model;
    private int tahun;

    public Motor() {
        merk = "Unknown";
        model = "Unknown";
        tahun = 0;
    }

    public Motor(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    public void getInfo() {
        System.out.println("Motor " + merk + " " + model + " tahun " + tahun);
    }
    public void setTahun(int tahunBaru) {
        tahun = tahunBaru;
    }
}

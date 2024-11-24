

public class Mahasiswa {
    private String nim;
    private String nama;
    private double uts;
    private double uas;

    // Constructor
    public Mahasiswa(String nim, String nama, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double calculateNilaiAkhir() {
        return 0.4 * uts + 0.6 * uas;
    }

    public void displayInfo() {
        System.out.printf("Nim = %s%n", nim);
        System.out.printf("Nama = %s%n", nama);
        System.out.printf("UTS = %.2f%n", uts);
        System.out.printf("UAS = %.2f%n", uas);
        System.out.printf("Nilai Akhir = %.2f%n", calculateNilaiAkhir());
    }
}
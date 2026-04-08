package Tugas2_2407107;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // con
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    // getter
    public double getTinggi() {
        return tinggi;
    }

    // setter
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}
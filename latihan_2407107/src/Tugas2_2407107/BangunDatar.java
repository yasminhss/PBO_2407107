package Tugas2_2407107;

public class BangunDatar {
    //atribut untuk menjabarkan tipe datanya
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}
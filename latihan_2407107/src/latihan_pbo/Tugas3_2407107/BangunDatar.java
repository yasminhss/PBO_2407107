package latihan_pbo.Tugas3_2407107;

public class BangunDatar {
    // atribut (enkapsulasi)
    protected double varA;
    protected double varB;

    //overloading (dalam 1clas bisa lebih cons/method,"harus berbeda parameter")
    
    // constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    // method default
    public double hitungLuas() {
        return 0;
    }

    // method tampilkan
    public void tampilkan() {
        System.out.println("Luas bangun datar: " + hitungLuas());
    }
}


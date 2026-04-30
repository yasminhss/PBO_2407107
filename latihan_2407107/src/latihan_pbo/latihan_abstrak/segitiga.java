package latihan_pbo.latihan_abstrak;

public class segitiga extends BangunDatar {
    private double alas, tinggi;

    public segitiga (double alas, double tinggi){
        super("segitiga");
        this.tinggi = tinggi;
        this.alas = alas;
    }

    @Override
    double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
}
package latihan_pbo.Tugas3_2407107;

public class Persegi extends BangunDatar {

    public Persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return varA * varA;
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + varA);
        System.out.println("Luas: " + hitungLuas());
    }

}

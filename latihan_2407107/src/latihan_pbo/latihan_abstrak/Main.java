package latihan_pbo.latihan_abstrak;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new persegi(4),
            new segitiga(2, 3)
        };

        for (BangunDatar b : bd) {
            b.Display();
            System.out.println("luas:" + b.hitungLuas());
            System.out.println("............");
        }
    }
}
package latihan_pbo.latihan1_2407107;

class Cafe{
    String nama;
    String alamat;
    String menu;

    //consrturktor//
    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama cafenya = " + nama);
        System.out.println("alamatnya = " + alamat);
    }

    //method//
    void buka(){
        System.out.println("Cafe sudah buka");
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("halaman","indramayu");
        cafe1.buka();
        Cafe cafe2 = new Cafe("nyonya", "Bandung");
        cafe2.buka();

        System.out.println("praktikum 1");
    }
}
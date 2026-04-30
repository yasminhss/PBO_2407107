package latihan_pbo.latihan_abstrak;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar (String nama) {
        this.nama = nama;
    }

    //abstract methode//
    abstract double hitungLuas();

    public void Display(){
        System.out.println("ini adalah : " + nama
        );
    }
}

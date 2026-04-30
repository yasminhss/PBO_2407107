package latihan_pbo.Tugas4_2407107;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Bayar: " + hitungTotal());
    }
} 

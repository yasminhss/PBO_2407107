package latihan_pbo.Tugas4_2407107;

public class Main {
    public static void main(String[] args) {

        Menu m;

        m = new MenuItem("Nasi Goreng", 15000, 2);
        m.tampilkan();

        System.out.println();

        m = new MenuItem("Mie Ayam", 12000, 3);
        m.tampilkan();
    }
}

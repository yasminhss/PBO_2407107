package latihan_pbo.latihan_bangundatar;

public class Main {
    
    public static void main(String[] args) {
        SegiTiga sTiga = new SegiTiga();

        sTiga.setAlas(23);
        sTiga.setTinggi(45);
        System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegiTiga());
    }
}
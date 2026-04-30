package latihan_pbo.latihan_abstrak;

public class persegi extends BangunDatar {
    private double sisi;

    public persegi (double sisi){
        super("persegi");
        this.sisi = sisi;
    }
    
    @Override
    double hitungLuas(){
        return sisi * sisi;
    }
}
package latihan_pbo.latihan2_2407107;

public class Coba{
    protected double panjang;
    protected double lebar;
    protected double sisi;

    // method//
    //setter//
    public void setpanjang ( double panjang) {
        this.panjang= panjang;
    }
    
    //getter//
    public double getpanjang (){
        return panjang;
    }

    public void setlebar (double lebar) {
        this.lebar =lebar;
    }

    public void cetakluas(){
        System.out.println("luasnya adalah : " + (panjang * lebar));
    }

    public double hitungluas(){
        double luas = panjang * lebar;
        return luas;
    }
}
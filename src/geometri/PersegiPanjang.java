package geometri;

public class PersegiPanjang {
    //membuat variabel
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //membuat method luas dan keliling
    double luas(){
        return panjang*lebar;
    }
    
    double keliling(){
        return 2 * (panjang + lebar);
    }
}

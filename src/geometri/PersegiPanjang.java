package geometri;

public class PersegiPanjang {
    //membuat variabel
    double panjang, lebar;
    
    //membuat method luas dan keliling
    double luas(){
        return panjang*lebar;
    }
    
    double keliling(){
        return 2 * (panjang + lebar);
    }
}

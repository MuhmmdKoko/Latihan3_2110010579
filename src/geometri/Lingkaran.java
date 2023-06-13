package geometri;

public class Lingkaran {
    //membuat variabel
    double radius;
    
    //membuat method luas dan keliling
    double luas(){
        return 3.14 * Math.pow (radius, 2);
    }
    
    double keliling(){
        return 2 * 3.14 * radius;
    }
}

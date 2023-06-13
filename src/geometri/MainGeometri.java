package geometri;

public class MainGeometri {
    public static void main(String[] args) {
        //membuat objek
        Lingkaran koko1 = new Lingkaran (25);
        PersegiPanjang koko2 = new PersegiPanjang (10,15);
        
        //menampilkan luas dan keliling Lingkaran dan PersegiPanjang
        System.out.println("Luas Lingkaran: " + koko1.luas());
        System.out.println("Keliling Lingkaran: " + koko1.keliling());
        System.out.println("");
        System.out.println("Luas Persegi Panjang: " + koko2.luas());
        System.out.println("Keliling Persegi Panjang: " + koko2.keliling());
    }
}

import java.lang.Math;

public class Segitiga {

    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return (int)(0.5 * alas * tinggi);
    }

    public int hitungKeliling() {
        return alas + tinggi + (int)Math.sqrt(alas*alas + tinggi*tinggi);
    }
    
}


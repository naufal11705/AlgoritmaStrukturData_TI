public class LimasSegiEmpat {

    public int sisiAlas;
    public int tinggiLimas;

    public LimasSegiEmpat(int s, int t) {
        sisiAlas = s;
        tinggiLimas = t;
    }

    public double hitungLuasPermukaan() {
        return (sisiAlas * sisiAlas) + (0.5 * (4 * sisiAlas) * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3) * (sisiAlas * sisiAlas) * tinggiLimas;
    }
    
}


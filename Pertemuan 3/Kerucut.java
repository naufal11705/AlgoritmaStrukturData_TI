import java.lang.Math;

public class Kerucut {

    public int jarijari;
    public int sisimiring;

    public Kerucut(int r, int s) {
        jarijari = r;
        sisimiring = s;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jarijari * (sisimiring + jarijari);
    }

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(jarijari, 2) * sisimiring;
    }
    
}


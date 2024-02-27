public class Mahasiswa {

    String nama, nim;
    char kelamin;
    double ipk;

    public Mahasiswa() {
        
    }

    double HitungRataIPK(Mahasiswa[] mhsArr) {
        double totalIpk = 0;

        for (Mahasiswa mhs : mhsArr) {
            totalIpk += mhs.ipk;
        }

        return totalIpk / mhsArr.length;
    }

}

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

    void TampilMhsIpkTertinggi(Mahasiswa[] mhsArr) {
        double ipkTertinggi = 0;
        Mahasiswa mhsIpkTertinggi = null;

        for (Mahasiswa mhs : mhsArr) {
            if (mhs.ipk > ipkTertinggi) {
                ipkTertinggi = mhs.ipk;
                mhsIpkTertinggi = mhs;
            }
        }

        System.out.println("\nData Mahasiswa dengan IPK Tertinggi:");
        System.out.println("Nama: " + mhsIpkTertinggi.nama);
        System.out.println("NIM: " + mhsIpkTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mhsIpkTertinggi.kelamin);
        System.out.println("Nilai IPK: " + mhsIpkTertinggi.ipk);
    }

}

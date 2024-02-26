public class Buku04 {

    String judul, pengarang;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if(stok > jml) {
            stok -= jml;
            terjual = jml;
            System.out.println("Total : " + hitungHargaTotal());
            System.out.println("Total Diskon : " + hitungDiskon());
            System.out.println("Total Bayar : " + hitungHargaBayar());
        }   
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku04() {

    }

    public Buku04(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal() {
        return harga * terjual;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 150000) {
            return hitungHargaTotal() * 12 / 100;
        } else if (hitungHargaTotal() >= 75000 && hitungHargaTotal() <= 150000) {
            return hitungHargaTotal() * 5 / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
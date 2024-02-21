public class Buku04 {

    String judul, pengarang;
    int halaman, stok, harga;

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

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int jml) {
        if (hitungHargaTotal(jml) > 150000) {
            return hitungHargaTotal(jml) * 12 / 100;
        } else if (hitungHargaTotal(jml) >= 750005 && hitungHargaTotal(jml) <= 150000 ) {
            return hitungHargaTotal(jml) * 5 / 100;
        } else {
            return hitungHargaTotal(jml);
        }
    }

    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml)-hitungDiskon(jml);
    }




}
# Pertemuan 02 - Object

**Nama :** Ahmad Naufal Waskito Aji<br>
**NIM :** 2341720080<br>
**Kelas :** TI-1B<br>
**Absen :** 04

**2.1 Percobaan 1: Deklarasi Class, Atribut dan Method**
**2.1.1 Langkah-langkah percobaan**
```java
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
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

}
```

**2.1.2 Verifikasi Hasil Percobaan**

![Hasil](./docs/2.1.2.png)

**2.1.3 Pertanyaan**
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut
sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
6. Commit dan push kode program ke Github

**2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method**
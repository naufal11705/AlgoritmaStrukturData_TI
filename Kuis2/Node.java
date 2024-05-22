package Kuis2;

public class Node {

    String nama;
    int pertandingan;
    int menang;
    int seri;
    int kalah;
    int golMasuk;
    int golKebobolan;
    int selisihGol;
    int poin;
    Node next;

    Node(String nama, int pertandingan, int menang, int seri, int kalah, int golMasuk, int golKebobolan, int selisihGol, int poin, Node berikutnya) {
        this.nama = nama;
        this.pertandingan = pertandingan;
        this.menang = menang;
        this.seri = seri;
        this.kalah = kalah;
        this.golMasuk = golMasuk;
        this.golKebobolan = golKebobolan;
        this.selisihGol = selisihGol;
        this.poin = poin;
        next = berikutnya;
    }
}

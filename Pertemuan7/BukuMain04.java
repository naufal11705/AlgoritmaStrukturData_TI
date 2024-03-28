package Pertemuan7;
import java.util.Scanner;

public class BukuMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        PencarianBuku04 data = new PencarianBuku04();
        int jumBuku = 5;
    
        System.out.println("---------------------------------------------"); 
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i=0; i<jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang: \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku04 m = new Buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------------"); 
        System.out.println("Data keseluruhan Mahasiswa: ");  
        data.tampil();

        System.out.println("---------------------------------------------"); 
        System.out.println("---------------------------------------------"); 
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("===================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        /*System.out.println("---------------------------------------------"); 
        System.out.println("---------------------------------------------"); 
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku: ");
        String search = s1.nextLine();
        System.out.println("===================================");
        System.out.println("Menggunakan Sequential Search");
        posisi = data.FindSeqSearch(search);
        data.TampilPosisi(posisi);
        data.TampilData(posisi);

        System.out.println("---------------------------------------------"); 
        System.out.println("Data keseluruhan Mahasiswa setelah sorting: ");
        data.bubbleSortJudul();
        data.tampil();
        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(search, 0, jumBuku - 1);
        data.TampilPosisi(posisi);
        data.TampilData(posisi);*/
    }
}

import java.util.Scanner;

public class KasusMain04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int posisi;

        int[] arrayKasus = {50, 2, 41, 25, 8, 37, 42, 6, 16, 43, 47, 19, 24, 41, 27, 26, 2};

        PencarianKasus04 data = new PencarianKasus04();
        int jumKasus = arrayKasus.length;

        for (int i=0; i<jumKasus; i++) {
            Kasus04 m = new Kasus04(arrayKasus[i]);
            data.tambah(m);
        }

        System.out.println("Menampilkan Semua Data Kasus");
        data.tampil();

        System.out.println();

        posisi = data.FindBinarySearchAsc(24, 0, jumKasus - 1);
        Kasus04 dataKasus = data.findKasus(24);

        System.out.print("Kondisi 1: ");
        data.tampil();
        data.tampilPosisi(24, posisi);

        System.out.print("Kondisi 2: ");
        data.selectionSortAsc();
        data.tampil();

        posisi = data.FindBinarySearchAsc(24, 0, jumKasus - 1);
        data.tampilPosisi(24, posisi);

        System.out.print("Kondisi 3: ");
        data.selectionSortDesc();
        data.tampil();
        
        posisi = data.FindBinarySearchDesc(24, 0, jumKasus - 1);
        data.tampilPosisi(24, posisi);


        System.out.print("Kondisi 4: ");
        posisi = data.FindBinarySearchDesc(35, 0, jumKasus - 1);
        data.tampilPosisi(35, posisi);



    }
    
}

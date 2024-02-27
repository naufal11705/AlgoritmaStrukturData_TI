import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        Mahasiswa[] mhsArray = new Mahasiswa[sc04.nextInt()];

        for(int i=0; i<mhsArray.length; i++) {

            System.out.println("\nMasukkan Data Mahasiswa ke-" + (i+1));
            mhsArray[i] = new Mahasiswa();
            System.out.print("Masukkan Nama: ");
            mhsArray[i].nama = sc04.next();
            System.out.print("Masukkan NIM: ");
            mhsArray[i].nim = sc04.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhsArray[i].kelamin = sc04.next().toUpperCase().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhsArray[i].ipk = sc04.nextDouble();
    
        }

        for(int i=0; i<mhsArray.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhsArray[i].nama);
            System.out.println("NIM: " + mhsArray[i].nim);
            System.out.println("Jenis Kelamin: " + mhsArray[i].kelamin);
            System.out.println("Nilai IPK: " + mhsArray[i].ipk);
        }

        sc04.close();

    }

}

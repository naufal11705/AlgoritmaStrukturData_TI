import java.util.Scanner;
import java.text.DecimalFormat;

public class Array {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        String[][] MataKuliah = new String[8][3];

        Scanner sc04 = new Scanner(System.in);

        String NamaMatkul, NilaiHuruf;
        int BobotSKS, JumlahSKS = 0;
        Double NilaiAngka, IP = 0.0;
        String konfirmasi;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        do {

            System.out.print("Masukkan Nama Mata Kuliah: ");
            NamaMatkul = sc04.nextLine();
            System.out.print("Masukkan Nilai Huruf (A,B+,B,C+,C,D,E): ");
            NilaiHuruf = sc04.nextLine();
            System.out.print("Masukkan Bobot SKS:  ");
            BobotSKS = sc04.nextInt();

            System.out.println();

            for(int i=0; i<MataKuliah.length; i++) {
                if(MataKuliah[i][0] == null) {
                    MataKuliah[i][0] = NamaMatkul;
                    MataKuliah[i][1] = NilaiHuruf;
                    MataKuliah[i][2] = String.valueOf(BobotSKS);
                    break;
                }
            }

            System.out.print("Apakah lanjut input nilai (Y/N): ");
            konfirmasi = sc04.next();
            sc04.nextLine();

            System.out.println();

        } while (konfirmasi.equalsIgnoreCase("y"));
            
        for(int i=0; i<MataKuliah.length; i++) {
            if(MataKuliah[i][0] != null) {
                JumlahSKS += Integer.parseInt(MataKuliah[i][2]);
            } else {
                break;
            }
        }

        for(int i=0; i<MataKuliah.length; i++) {
            if(MataKuliah[i][0] != null) {
                NilaiAngka = MataKuliah[i][1].equalsIgnoreCase("A") ? 4.0
                : MataKuliah[i][1].equalsIgnoreCase("B+") ? 3.5
                : MataKuliah[i][1].equalsIgnoreCase("B") ? 3.0
                : MataKuliah[i][1].equalsIgnoreCase("C+") ? 2.5
                : MataKuliah[i][1].equalsIgnoreCase("C") ? 2.0
                : MataKuliah[i][1].equalsIgnoreCase("D") ? 1.0
                : 0.0;

                IP += ((NilaiAngka * Integer.parseInt(MataKuliah[i][2])) / JumlahSKS);
            }
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.println(String.format("%-40s %-12s %-12s",
        "MK",
        "Nilai Huruf",
        "Bobot Nilai"
        ));

        for(int i=0; i<MataKuliah.length; i++) {

            if(MataKuliah[i][0] != null) {

                NilaiAngka = MataKuliah[i][1].equalsIgnoreCase("A") ? 4.0
                : MataKuliah[i][1].equalsIgnoreCase("B+") ? 3.5
                : MataKuliah[i][1].equalsIgnoreCase("B") ? 3.0
                : MataKuliah[i][1].equalsIgnoreCase("C+") ? 2.5
                : MataKuliah[i][1].equalsIgnoreCase("C") ? 2.0
                : MataKuliah[i][1].equalsIgnoreCase("D") ? 1.0
                : 0.0;
    
                System.out.println(String.format("%-40s %-12s %-12s",
                MataKuliah[i][0],
                MataKuliah[i][1],
                NilaiAngka
                ));

            }

        }

        System.out.println("==============================");
        System.out.println("IP: " + (df.format(IP)));

        sc04.close();
    }
}

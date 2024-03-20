import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        
        System.out.println("\nMethod yang tersedia");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan Method Pilihan (1/2): ");

        int metode = 0;
        metode = sc.nextInt();

        switch (metode) {
            case 1:
                System.out.println("HASIL - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                                            + png[i].nilai+ " pangkat "
                                            + png[i].pangkat+ " adalah "
                                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
        
            case 2:
                System.out.println("HASIL - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                                            + png[i].nilai+ " pangkat "
                                            + png[i].pangkat+ " adalah "
                                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
        
                sc.close();
                break;

            default:
                break;
        }
    }
}

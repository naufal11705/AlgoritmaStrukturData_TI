import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int jml = sc.nextInt();

        for(int i=0; i < jml; i++) {
            System.out.println("\n\nPERUSAHAAN KE "+(i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
    
            Sum sm = new Sum(elm);
            System.out.println("==========================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                sm.keuntungan[j] = sc.nextDouble();
            }
    
            System.out.println("\n\nPENDAPATAN PERUSAHAAN KE "+(i+1));
            System.out.println("====================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " +sm.totalBF(sm.keuntungan));
            System.out.println("====================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah %.2f", sm.elemen, sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    
            
        }
        
        sc.close();

    }
}

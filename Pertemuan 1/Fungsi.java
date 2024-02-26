import java.util.Scanner;

public class Fungsi {

    static Scanner sc04 = new Scanner(System.in);

    static int[][] RoyalGarden = { 
    { 10, 5, 15, 7 },
    { 6, 11, 9, 12 },
    { 2, 10, 10, 5 },
    { 5, 7, 12, 9 }};

    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {

        Pendapatan();
        Stok(4);

    }


    private static void Pendapatan() {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║" + centerString(62, "Pendapatan Setiap Cabang") + "║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-14s %-9s %-7s %-9s %-6s %-10s ║\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar",
                "Pendapatan");

        for(int i=0;i<RoyalGarden.length;i++) {

            int pendapatan = 0;
            pendapatan += RoyalGarden[i][0] * 75000;
            pendapatan += RoyalGarden[i][1] * 50000;
            pendapatan += RoyalGarden[i][2] * 60000;
            pendapatan += RoyalGarden[i][3] * 10000;

            System.out.printf("║ %-14s %-9s %-7s %-9s %-6s %-10s ║\n", "RoyalGarden " + (i+1), RoyalGarden[i][0], RoyalGarden[i][1], RoyalGarden[i][2], RoyalGarden[i][3],
            "Rp " + pendapatan);

        }

        System.out.println("╚══════════════════════════════════════════════════════════════╝");

    }

    private static void Stok(int cabang) {
        int index = cabang - 1;

        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║" + centerString(62, "Stok Bunga RoyalGarden " + cabang) + "║");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        for (int j = 0; j < RoyalGarden[3].length; j++) {
            System.out.println("║ " + jenisBunga[j] + ": " + RoyalGarden[3][j]);
        }
        System.out.println("╠══════════════════════════════════════════════════════════════╣");

        System.out.print("║ Apakah ada bunga yang mati? (y/n) : ");
        String pilihan = sc04.next();
        System.out.println("╠══════════════════════════════════════════════════════════════╣");

        if (pilihan.equalsIgnoreCase("y")) {
            System.out.print("║ Bunga Aglonema : ");
            int penguranganAglonema = sc04.nextInt();
            System.out.print("║ Bunga Keladi : ");
            int penguranganKeladi = sc04.nextInt();
            System.out.print("║ Bunga Alocasia : ");
            int penguranganAlocasia = sc04.nextInt();
            System.out.print("║ Bunga Mawar : ");
            int penguranganMawar = sc04.nextInt();
    
            System.out.println("║");
            System.out.println("║ Stok Bunga Setelah Pengurangan: ");
            System.out.println("║");

            System.out.println("║ " + jenisBunga[0] + ": " + (RoyalGarden[index][0] - penguranganAglonema) + " (-" + penguranganAglonema + ")");
            System.out.println("║ " + jenisBunga[1] + ": " + (RoyalGarden[index][1] - penguranganKeladi) + " (-" + penguranganKeladi + ")");
            System.out.println("║ " + jenisBunga[2] + ": " + (RoyalGarden[index][2] - penguranganAlocasia) + " (-" + penguranganAlocasia + ")");
            System.out.println("║ " + jenisBunga[3] + ": " + (RoyalGarden[index][3] - penguranganMawar) + " (-" + penguranganMawar + ")");
        } 

        System.out.println("╚══════════════════════════════════════════════════════════════╝");

    }

    private static String centerString(int width, String s) {
        int padSize = (width - s.length()) / 2;
        return String.format("%" + padSize + "s%s%" + (padSize + (width - s.length()) % 2) + "s", "", s, "");
    }

}

public class Fungsi {

    static int[][] RoyalGarden = new int[4][4];
    static String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static void main(String[] args) {

        RoyalGarden[0][0] = 10;
        RoyalGarden[0][1] = 5;
        RoyalGarden[0][2] = 15;
        RoyalGarden[0][3] = 7;

        RoyalGarden[1][0] = 6;
        RoyalGarden[1][1] = 11;
        RoyalGarden[1][2] = 9;
        RoyalGarden[1][3] = 12;

        RoyalGarden[2][0] = 2;
        RoyalGarden[2][1] = 10;
        RoyalGarden[2][2] = 10;
        RoyalGarden[2][3] = 5;

        RoyalGarden[3][0] = 5;
        RoyalGarden[3][1] = 7;
        RoyalGarden[3][2] = 12;
        RoyalGarden[3][3] = 9;

        Pendapatan();
        StokBungaRG4();

    }

    private static void Pendapatan() {

        for(int i=0;i<RoyalGarden.length;i++) {

            int pendapatan = 0;
            pendapatan += RoyalGarden[i][0] * 75000;
            pendapatan += RoyalGarden[i][1] * 50000;
            pendapatan += RoyalGarden[i][2] * 60000;
            pendapatan += RoyalGarden[i][3] * 10000;
            System.out.println("Pendapatan RoyalGarden " + (i+1) + ": " + pendapatan);

        }

    }

    private static void StokBungaRG4() {

        System.out.println("\nJumlah Stok Bunga di RoyalGarden 4:");
        for (int j = 0; j < RoyalGarden[3].length; j++) {
            System.out.println(jenisBunga[j] + ": " + RoyalGarden[3][j]);
        }

        RoyalGarden[3][0] -= 1;
        RoyalGarden[3][1] -= 2;
        RoyalGarden[3][2] -= 0;
        RoyalGarden[3][3] -= 5; 

        System.out.println("\nJumlah Stok Bunga di RoyalGarden 4 setelah bunga mati:");
        for (int j = 0; j < RoyalGarden[3].length; j++) {
            System.out.println(jenisBunga[j] + ": " + RoyalGarden[3][j]);
        }        

    }

}

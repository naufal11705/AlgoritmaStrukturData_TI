package latihan;
import java.util.Scanner;


public class GraphMain04 {
    public static void main(String[] args) {
        /*Graph04 gedung = new Graph04(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        try {
            gedung.degree(0);
            gedung.printGraph();
            System.out.println();
            gedung.removeEdge(1, 3);
            gedung.printGraph();
        } catch (Exception e) {
            System.out.println(e);
        }*/

        /*GraphMatriks04 gdg = new GraphMatriks04(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();*/

        int asal, tujuan, jarak;

        Scanner scanner04 = new Scanner(System.in);
        Graph04 gedung = new Graph04(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        while (true) {
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.print("Masukkan Pilihan: ");

            int menu = scanner04.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Asal: ");
                    asal = scanner04.nextInt();
                    System.out.print("Masukkan Tujuan: ");
                    tujuan = scanner04.nextInt();
                    System.out.print("Masukkan Jarak: ");
                    jarak = scanner04.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.print("Masukkan Asal: ");
                    asal = scanner04.nextInt();
                    System.out.print("Masukkan Tujuan: ");
                    tujuan = scanner04.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan Asal: ");
                    asal = scanner04.nextInt();
                    try {
                        gedung.degree(asal);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    try {
                        gedung.printGraph();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.print("Masukkan Asal: ");
                    asal = scanner04.nextInt();
                    System.out.print("Masukkan Tujuan: ");
                    tujuan = scanner04.nextInt();
                    try {
                        gedung.cekEdge(asal, tujuan);  
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }

        }

    }
}

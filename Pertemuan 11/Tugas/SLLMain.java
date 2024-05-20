package Tugas;

import java.util.Scanner;

public class SLLMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Exit");
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst("Anton", 111);
        singLL.print();
        singLL.addLast("Prita", 112);
        singLL.print();
        singLL.addFirst("Yusuf", 113);
        singLL.print();
        singLL.insertAfter(113, "Doni", 114);
        singLL.print();
        singLL.insertAt(3, "Sari", 115);
        singLL.print();

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    int nim = sc.nextInt();
                    singLL.addFirst(nama, nim);
                    singLL.print();
                    break;

                case 2:
                    singLL.removeLast();
                    singLL.print();
                    break;

                case 3:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);

    }
}

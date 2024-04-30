package Tugas;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cek Antrian Berdasarkan Nama");

        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;

                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String key = sc.nextLine();
                    antri.peekPosition(key);
                    break;
            
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 | pilih == 6);
    } 
}

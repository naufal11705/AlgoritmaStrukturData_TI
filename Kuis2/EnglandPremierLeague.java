package Kuis2;

public class EnglandPremierLeague {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String nama, int pertandingan, int menang, int seri, int kalah, int golMasuk, int golKebobolan, int selisihGol, int poin) {
        Node ndInput = new Node(nama, pertandingan, menang, seri, kalah, golMasuk, golKebobolan, selisihGol, poin, head);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addPoints(String nama, int menang, int seri, int kalah, int golMasuk, int golKebobolan, int selisihGol) {
        Node current = head;
        int poin;

        if (menang == 1) {
            poin = 3;
        } else if (seri == 1) {
            poin = 1;
        } else {
            poin = 0;
        }
        
        while (current != null) {
            if (current.nama.equals(nama)) {
                current.pertandingan++;
                current.menang += menang;
                current.seri += seri;
                current.kalah += kalah;
                current.golMasuk += golMasuk;
                current.golKebobolan += golKebobolan;
                current.selisihGol += selisihGol;
                current.poin += poin;
            }
            current = current.next;
        }
    }

    void sortBypoin() {
        if (head == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current != null && current.next != null) {
                if (current.poin < current.next.poin) {
                    String tempnama = current.nama;
                    current.nama = current.next.nama;
                    current.next.nama = tempnama;

                    int tempPertandingan = current.pertandingan;
                    current.pertandingan = current.next.pertandingan;
                    current.next.pertandingan = tempPertandingan;

                    int tempMenang = current.menang;
                    current.menang = current.next.menang;
                    current.next.menang = tempMenang;

                    int tempSeri = current.seri;
                    current.seri = current.next.seri;
                    current.next.seri = tempSeri;

                    int tempKalah = current.kalah;
                    current.kalah = current.next.kalah;
                    current.next.kalah = tempKalah;

                    int tempGolMasuk = current.golMasuk;
                    current.golMasuk = current.next.golMasuk;
                    current.next.golMasuk = tempGolMasuk;

                    int tempGolKebobolan = current.golKebobolan;
                    current.golKebobolan = current.next.golKebobolan;
                    current.next.golKebobolan = tempGolKebobolan;
                    
                    int tempSelisihGol = current.selisihGol;
                    current.selisihGol = current.next.selisihGol;
                    current.next.selisihGol = tempSelisihGol;

                    int tempPoin = current.poin;
                    current.poin = current.next.poin;
                    current.next.poin = tempPoin;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    void print() {
        Node current = head;
        System.out.println("================================================================================================================================================");
        System.out.printf("|                                                           KLASEMEN LIGA INGGRIS 2023-2024                                                    |\n");
        System.out.println("================================================================================================================================================");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-23s | %-15s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |\n", "Peringkat", "Klub", "Pertandingan", "Menang", "Seri", "Kalah", "Gol Masuk", "Gol Kebobolan", "Selisih Gol", "Poin");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        int peringkat = 1;
        while (current != null) {
            System.out.printf("| %-10d | %-23s | %-15d | %-8d | %-8d | %-8d | %-9d | %-13d | %-11d | %-8d |\n", peringkat, current.nama, current.pertandingan, current.menang, current.seri, current.kalah, current.golMasuk, current.golKebobolan, current.selisihGol, current.poin);
            current = current.next;
            peringkat++;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
package Tugas;

public class Queue {

    Pembeli[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + data[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[front].nama + data[front].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terdepan: " + data[front].nama + data[front].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli antri) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + data[rear].nama + data[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int currentPosition = front;
            int position = 0;
            boolean found = false;
            while (currentPosition != rear) {
                if (data[currentPosition].nama.equals(nama)) {
                    found = true;
                    break;
                }
                currentPosition = (currentPosition + 1) % max;
                position++;
            }
            if (data[currentPosition].nama.equals(nama)) {
                found = true;
            }
            if (found) {
                System.out.println("Posisi " + nama + " dalam antrian: " + position);
            } else {
                System.out.println("Nama tidak ditemukan dalam antrian");
            }
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[front].nama + data[front].noHP);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terdepan: " + data[front].nama + data[front].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
}

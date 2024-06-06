# <p align="center">JOBSHEET X - DOUBLE LINKED LISTS</p>

<br><br>

<p align="center">
    <img src="./docs/LogoPolinema.png" alt="Your Image Description">
</p>

<br><br>

<p align="center">
    Nama : Ahmad Naufal Waskito Aji <br>
    NIM : 2341720080 <br>
    Kelas : TI-1B <br>
    Prodi : D4 Teknik Informatika
</p>

***

## Percobaan 1
### **1.1 Kode Percobaan**
``DoubleLinkedLists.java``
```java
    public class DoubleLinkedLists {
        Node head;
        int size;

        public DoubleLinkedLists() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addFirst(int item) {
            if (isEmpty()) {
                head = new Node(null, item, null);
            } else {
                Node newNode = new Node(null, item, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast(int item) {
            if (isEmpty()) {
                addFirst(item);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                Node newNode = new Node(current, item, null);
                current.next = newNode;
                size++;
            }
        }

        public void add(int item, int index) throws Exception {
            if (isEmpty()) {
                addFirst(item);
            } else if (index < 0 || index > size) {
                throw new Exception("Nilai indeks di luar batas");
            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.prev == null) {
                    Node newNode = new Node(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node newNode = new Node(current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void clear() {
            head = null;
            size = 0;
        }

        public void print() {
            if (!isEmpty()) {
                Node tmp = head;
                while (tmp != null) {
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println("\nberhasil diisi");
            } else {
                System.out.println("Linked Lists Kosong");
            }
        }
    }
    ```

    ``Node.java``
    ```java
    public class Node {
        int data;
        Node prev, next;

        Node(Node prev, int data, Node next) {
            this.prev=prev;
            this.data=data;
            this.next=next;
        }
    }
```

``DoubleLinkedListMain.java``
```java
    public class DoubleLinkedListMain {
        public static void main(String[] args) {
            DoubleLinkedLists dll = new DoubleLinkedLists();
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            try {
                dll.add(40, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            dll.clear();
            dll.print();
            System.out.println("Size : "+dll.size());
        }
    }
```


### **1.2 Verifikasi Hasil Percobaan**

![Hasil](./docs/1.2.1.png)

### **1.3 Pertanyaan**
1.  Jelaskan perbedaan antara single linked list dengan double linked lists! <br>
    **Jawaban :**
    ``
    Single Linked List hanya memiliki pointer yaitu next, Double Linked List memiliki pointer prev dan next.
    ``

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut? <br>
    **Jawaban :**
    ``
    Untuk menyimpan alamat node sebelumnya dan sesudahnya.
    ``

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?  <br> 
    ```java
        public DoubleLinkedLists() {
            head == null;
            size = 0;
        }
    ```
    **Jawaban :**
    ``
    Menginisialisasi Double Linked List kosong.
    ``

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? <br>
    ```java
        Node newNode = new Node(null, item, head); 
    ```
    **Jawaban :**
    ``
    Karena pada node yang paling awal tidak memiliki node sebelumnya.
    ``
    
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? <br>
    **Jawaban :**
    ``
    Memasukkan alamat node baru ke dalam node prev dari node head.
    ``

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? <br>
    ```java
        Node newNode = new Node(current, item, null); 
    ```
    **Jawaban :**
    ``
    Membuat node baru dengan prev menyimpan alamat node terakhir dan next yang bernilai null karena node terakhir tidak memiliki next.
    ``

7. Pada method add(), terdapat potongan kode program sebagai berikut: <br>
    ```java
        if (current.prev == null) {
            Node newNode = new Node(null, item, current);
            current.prev = newNode;
            head = newNode;
    ```
    **Jawaban :**
    ``
    Jika yang ditemukan adalah node dengan node prev yang bernilai null (node paling awal), maka akan dibuat node baru yang akan menjadi node paling awal.
    ``



## Percobaan 2
### **2.1 Kode Percobaan**
``DoubleLinkedLists.java``
```java
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }    

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
```

``DoubleLinkedListMain.java``
```java
    public class DoubleLinkedListMain {
        public static void main(String[] args) {
            DoubleLinkedLists dll = new DoubleLinkedLists();
            try {
                dll.addLast(50);
                dll.addLast(40);
                dll.addLast(10);
                dll.addLast(20);
                dll.print();
                System.out.println("Size : "+dll.size());
                System.out.println("==================================");
                dll.removeFirst();
                dll.print();
                System.out.println("Size : "+dll.size());
                System.out.println("==================================");
                dll.removeLast();
                dll.print();
                System.out.println("Size : "+dll.size());
                System.out.println("==================================");
                dll.remove(1);
                dll.print();
                System.out.println("Size : "+dll.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
```

### **2.2 Verifikasi Hasil Percobaan**

![Hasil](./docs/2.2.1.png)

### **1.3 Pertanyaan**
1.  Apakah maksud statement berikut pada method removeFirst()? <br>
    ```java
        head = head.next;
        head.prev = null;
    ```
    **Jawaban :**
    ``
    Menggeser alamat head ke node setelahnya dan menjadikan node prev dari node tersebut menjadi null.
    ``

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? <br>
    **Jawaban :**
    ``
    Dengan melakukan while loop sampai menemukan node sebelum node terakhir. Kemudian menghapus node next dari node tersebut.
    ``

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove! <br>
    ```java
        Node tmp = head.next;

        head.next=tmp.next;
        tmp.next.prev=head;
    ```
    **Jawaban :**
    ``
    Karena hanya bisa menghapus node next dari node head.
    ``

4. Jelaskan fungsi kode program berikut ini pada fungsi remove! <br>
    ```java
        current.prev.next = current.next;
        current.next.prev = current.prev;
    ```
    **Jawaban :**
    ``
    Mengubah alamat referensi dari node next dari node sebelum node yang ingin dihapus menjadi node setelah node yang ingin dihapus dan mengubah alamat referensi dari node prev dari node setelah node yang ingin dihapus menjadi node sebelum node yang ingin dihapus.
    ``

## Percobaan 3
### **3.1 Kode Percobaan**
``DoubleLinkedLists.java``
```java
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
```

``DoubleLinkedListMain.java``
```java
package doublelinkedlists;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        try {
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : "+dll.size());
            System.out.println("==================================");
            System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
            System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### **3.2 Verifikasi Hasil Percobaan**

![Hasil](./docs/3.2.1.png)

### **3.3 Pertanyaan**
1.  Jelaskan method size() pada class DoubleLinkedLists! <br>
    **Jawaban :**
    ``
    Mengembalikan jumlah node.
    ``

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1! <br>
    **Jawaban :**
    ``
    Ubah seluruh variable i yang digunakan untuk perulangan menjadi 1.
    ``

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! <br>
    **Jawaban :**
    ``
    Single Linked List menambahkan node baru pada setelah node yang didapat dari pencarian index, sedangkan Double Linked List menambahkan node baru sebelum node yang didapat dari pencarian index.
    ``

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! <br>
    **Jawaban :**
    ``
    Untuk mendapatkan kembalian boolean, kode a memeriksa variable size sedangkan kode b menggunakan variable head.
    ``
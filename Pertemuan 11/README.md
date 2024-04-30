# <p align="center">JOBSHEET IX - LINKED LIST</p>

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

## Percobaan 1: Pembuatan Single Linked List
### **1.1 Kode Percobaan**
``SingleLinkedList.java``
```java
public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print(){
        if(!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }    

    void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    
                }
                break;
            }
            temp = temp.next;
        } while(temp != null);
    }

    void insertAt(int index, int input){
        Node ndInput = new Node(input, null);
        if(index < 0){
            System.out.println("perbaiki logikanya!"
                    + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }
}
```

``SLLMain.java``
```java
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
```

### **1.2 Verifikasi Hasil Percobaan**

![Hasil](./docs/1.2.1.png)

### **1.3 Pertanyaan**
1.  Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? <br>
    **Jawaban :**
    ``
    ?
    ``

2. Jelaskan kegunaan variable temp secara umum pada setiap method! <br>
    **Jawaban :**
    ``
    ?
    ``

3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut  <br> 
    ```java
        if(temp.next.next==null) tail=temp.next;
    ```
    **Jawaban :**
    ``
    ?
    ``


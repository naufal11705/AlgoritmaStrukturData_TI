package Tugas;
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
                System.out.print("\t" + "[" + tmp.nim + " " + tmp.nama + "]");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(String nama, int nim) {
        Node ndInput = new Node(nama, nim, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(String nama, int nim) {
        Node ndInput = new Node(nama, nim, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }    

    void insertAfter(int key, String nama, int nim){
        Node ndInput = new Node(nama, nim, null);
        Node temp = head;
        do{
            if(temp.nim == key){
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

    void insertAt(int index, String nama, int nim){
        Node ndInput = new Node(nama , nim, null);
        if(index < 0){
            System.out.println("perbaiki logikanya!"
                    + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(nama, nim);
        } else {
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(nama, nim, temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong,"
                    + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
}

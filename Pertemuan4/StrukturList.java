package Pertemuan4;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Fungsi untuk menambahkan elemen di akhir (tail)
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node temp = HEAD;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Fungsi untuk menambahkan elemen di awal (head)
    public void addHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Fungsi untuk menambahkan elemen di tengah (middle)
    public void addMid(int data, int position) {
        Node curNode;
        Node newNode = new Node(data);
        if(isEmpty()) {
            HEAD = newNode;
        }else {
            curNode = HEAD;
            if(position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode;
            }else {
                int i =1;
                while(i < position -1 && curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    i++;
                }
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }

    }

    // Fungsi untuk menampilkan elemen list
    public void displayList() {
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

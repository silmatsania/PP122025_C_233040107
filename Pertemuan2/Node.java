package Pertemuan2;

class Node {
    private int nilai;
    private Node next;

    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    public int getNilai() {
        return nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
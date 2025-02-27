package TugasPertemuan4;

public class StrukturListDouble {
    private NodeDouble HEAD;

    public StrukturListDouble() {
        this.HEAD = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Fungsi untuk menambahkan elemen di awal (head)
    public void addHead(double data) {
        NodeDouble newNode = new NodeDouble(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // Fungsi untuk menambahkan elemen di akhir (tail)
    public void addTail(double data) {
        NodeDouble newNode = new NodeDouble(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            NodeDouble temp = HEAD;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Fungsi untuk menambahkan elemen di tengah (middle)
    public void addMid(double data, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        NodeDouble newNode = new NodeDouble(data);
        if (index == 0 || isEmpty()) { // Jika index 0 atau list kosong, tambahkan di awal
            addHead(data);
            return;
        }

        NodeDouble temp = HEAD;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.getNext();
            count++;
        }

        if (temp == null) {
            System.out.println("Index di luar batas, elemen tidak ditambahkan.");
            return;
        }

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    // Fungsi untuk menampilkan elemen list
    public void displayList() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }

        NodeDouble temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

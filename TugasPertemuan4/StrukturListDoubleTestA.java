package TugasPertemuan4;

public class StrukturListDoubleTestA {
    public static void main(String[] args) {
        StrukturListDouble listA = new StrukturListDouble();

        // Menambahkan elemen sesuai dengan urutan bagian a
        listA.addHead(2.1);   
        listA.addTail(4.5);   
        listA.addMid(3.4, 1); 

        // Menampilkan hasil
        System.out.print("Output a: ");
        listA.displayList();  // Output: 2.1 3.4 4.5
    }
}

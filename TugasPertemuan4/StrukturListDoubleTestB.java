package TugasPertemuan4;

public class StrukturListDoubleTestB {
    public static void main(String[] args) {
        StrukturListDouble listB = new StrukturListDouble();

        // Menambahkan elemen sesuai dengan urutan bagian b
        listB.addHead(3.4);   
        listB.addTail(4.5);   
        listB.addMid(2.1, 1); 
        listB.addMid(1.1, 2); 
        listB.addTail(5.5);   

        // Menampilkan hasil
        System.out.print("Output b: ");
        listB.displayList();  // Output: 3.4 2.1 1.1 4.5 5.5
    }
}

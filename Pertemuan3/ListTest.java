package Pertemuan3;

public class ListTest {
    public static void main(String[] args) {
       
        StrukturList list1 = new StrukturList();
        list1.addTail(3);
        list1.addTail(4);
        list1.addTail(5);
        
        System.out.print("Elemen: ");
        list1.displayList(); // Output: 3 4 5
    }
}




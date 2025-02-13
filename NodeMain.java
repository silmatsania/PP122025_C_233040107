package Pertemuan2;

public class NodeMain {
	    public static void main(String[] args) {
	        
	        // Membuat 2 buah node n1 & n2
	        Node n1 = new Node(5);
	        Node n2 = new Node(7);
	        
	        // Membuat relasi Node n1 & n2
	        n1.setNext(n2);
	        
	        // Menampilkan Node n1 & n2 dengan Pointer p
	        Node p = n1;
	        while (p != null) { 
	            System.out.printf("%d ", p.getNilai());
	            p = p.getNext(); // Pindah ke node berikutnya
	        }
	    }
	}


package Pertemuan2;

public class NodeMainB {
	  public static void main(String[] args) {
	        // Membuat urutan node: 2 -> 3 -> 5 -> 7 -> 9
	        Node n1 = new Node(2);
	        Node n2 = new Node(3);
	        Node n3 = new Node(5);
	        Node n4 = new Node(7);
	        Node n5 = new Node(9);

	        n1.setNext(n2);
	        n2.setNext(n3);
	        n3.setNext(n4);
	        n4.setNext(n5);

	        Node p = n1;
	        while (p != null) {
	            System.out.printf("%d ", p.getNilai());
	            p = p.getNext();
	        }
	    }
	}


import java.util.LinkedList;

public class DoublyLinked {
public static void main(String [] args) {
	DoublyLinkedList<Integer>doubly=new DoublyLinkedList();
	doubly.add(2);
	doubly.add(4);
	doubly.add(6);
	System.out.println("List is:");
	doubly.display();
	doubly.insert(3,5);
	System.out.println("doubly linked list after insretion is:");
	doubly.display();
}
}
class DoublyLinkedList <T>{
	private LinkedList <T> list=new LinkedList();
	public void add(T element) {
		list.addLast(element);
	}
	public void insert(int index,T element) {
		list.add(index,element);
	}
	public void remove(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element:list) {
			System.out.println(element+" ");
		}
		System.out.println();
	}
}

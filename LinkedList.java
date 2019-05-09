import java.util.*;
// implements ListTAD
public class LinkedList<T> {
	private int size;
    private Nodo head, tail;

    private class Nodo {
        private T element;
        private Nodo next;
        public Nodo (T element, Nodo next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
        public Nodo getNext() { return this.next; }
        public T getElement() { return this.element; }

    }

	public LinkedList() {
		this.size = 0;
	}
	
    public void add(T element) {
        Nodo newElement = new Nodo(element, null);

        if (this.size == 0) {
            this.tail = newElement;
            this.head = newElement;         
        } else {
            this.tail.setNext(newElement);
            this.tail = newElement;
        }
        this.size++;
    }
	
    public String toString() {
       	StringBuilder buffer = new StringBuilder(); 
        
		buffer.insert(0, "[");
        Nodo current = this.head;
		for(int i=0; i< size; i++) {
			buffer.insert(buffer.length(), current.getElement());
			if (i != (size-1)) buffer.insert(buffer.length(), ",");
            current = current.getNext();
		}
		buffer.insert(buffer.length(), "]");
		return buffer.toString();
    }
}
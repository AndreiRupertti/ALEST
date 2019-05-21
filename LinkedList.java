import java.util.*;

// implements ListTAD
public class LinkedList<T> {
    private int size;
    private Nodo head, tail;

    private class Nodo {
        private T element;
        private Nodo next;

        public Nodo(T element, Nodo next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        public Nodo getNext() {
            return this.next;
        }

        public T getElement() {
            return this.element;
        }

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

    public void add(int index, T element) {
        Nodo newElement = new Nodo(element, null);
        if (index < 0 || index > this.size)
            throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            newElement.setNext(this.head);
            if (this.tail == null)
                tail = newElement;

            this.head = newElement;
        } else {
            Nodo ant = this.head;
            for (int i = 1; i < index; i++)
                ant = ant.getNext();

            if (index == this.size)
                this.tail = newElement;
            newElement.setNext(ant.getNext());
            ant.setNext(newElement);
        }
        this.size++;
    }
    
    public T remove(int index) {
        Nodo removed = null;
        if (index == 0) {
            removed = this.head;
            Nodo aux = removed.getNext();
            this.head = aux;
        } else {
            Nodo prev = this.head;
            for (int i = 1; i< index; i++) {
                prev = prev.getNext();
            }

            if (index == this.size-1) {
                this.tail = prev;
                removed = prev.getNext();
                prev.setNext(null);
            } else {
                removed = prev.getNext();
                Nodo prox = removed.getNext();
                prev.setNext(prox);
            }
        }
        this.size--;
        return removed.getElement();
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.insert(0, "[");
        Nodo current = this.head;
        for (int i = 0; i < size; i++) {
            buffer.insert(buffer.length(), current.getElement());
            if (i != (size - 1))
                buffer.insert(buffer.length(), ", ");
            current = current.getNext();
        }
        buffer.insert(buffer.length(), "]");
        return buffer.toString();
    }
}
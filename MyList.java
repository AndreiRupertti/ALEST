import java.util.*;
// implements ListTAD
public class MyList<T> {
	private final int initialSize = 500;
	private T[] list;
	private int size;

	public MyList() {
		this.list = (T[]) new Object[initialSize];
	}
	
	public String toString() {
		StringBuilder buffer = new StringBuilder(); 
        
		buffer.insert(0, "[");
		for(int i=0; i< size; i++) {
			buffer.insert(buffer.length(), this.list[i]);
			if (i != (size-1)) buffer.insert(buffer.length(), ",");
		}
		buffer.insert(buffer.length(), "]");
		return buffer.toString();
	}

	public void add(T element) {
		this.list[this.size++] = element;
	}

	public void add(int index, T element) {
		if (index > this.size) throw new ArrayIndexOutOfBoundsException();
		this.list[index] = element;
		if (index == this.size) this.size++;
	}

	public T remove(int pos) {
		if (pos >= this.size) throw new ArrayIndexOutOfBoundsException();
		T element = this.list[pos];
		for (int i=pos; i < this.size; i++) {
			this.list[i] = this.list[i+1];
		}
		this.size--;
		return element;
	}

	public T remove(T element) {
		for (int i=0; i < this.size; i++) {
			if (this.list[i] == element) return this.remove(i);
		}
		return null;
	}


	public T get(int pos) {
		if (pos >= this.size) throw new ArrayIndexOutOfBoundsException();		
		return this.list[pos];
	}


	public void set(int index, T element) {
		if (index > this.size) throw new ArrayIndexOutOfBoundsException();
		this.list[index] = element;
		if (index == this.size) this.size++;
	}

	// public T search(T element) {}

	// public boolean isEmpty() {}

	// public int size() {} 

	// public int count(T element) {}

	// public void clean() {}

	// public Iterator<T> iterator() {}

	// /**********
	// * Métodos adicionais, para fins didáticos. 
	// *********/

	// public void addFirst(T element) {}


	// public void addLast(T element) {}


	// public T removeFirst() {}

	// public T removeLast() {}

	// public T getFirst() {

	// }

	// public T getLast() {

	// }

	
}
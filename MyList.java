public class MyList<T> {
	private final int initialSize = 500;
	private T[] list;
	private int size;

	public MyList() {
		this.list = (T[]) new Object[initialSize];
	}
	
	public void add(T value) {
		this.list[size] = value;
		size++;
	}
	
	public void toString() {
		System.out.print("[");
		for(int i=0; i< size; i++) {
			System.out.print(this.list[i]);
			System.out.print(",");
		}
		System.out.println("]");
	}
	
}
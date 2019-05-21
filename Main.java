public class Main {
	public static void main(String[] args) {
		LinkedList<Double> list = new LinkedList<>();

		list.add(1.0);
		list.add(2.5);
		list.add(3.3333);
		list.add(5.32);

		list.add(2, 4.4);

		list.remove(4);

		System.out.println(list.toString());
	}
}
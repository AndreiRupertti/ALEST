public class Main {
	public static void main(String[] args) {
		System.out.println("\n///////////\n\n");
		MyList<String> list = new MyList<>();
		list.add("Olá");
		list.add("opa");
		list.add(0, "Adiciona no inicio");
		list.add("Meio merda");
		list.remove("Olá");
		System.out.println(list.toString());
		System.out.println("\n///////////\n\n");
	}
}
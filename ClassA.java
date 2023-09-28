package SingleInheritance;

public class ClassA {
	static int s = 20;

	public static void raju() {
		int a = 100;
		int b = 200;
		int c = 300;
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		ClassA.raju();
		System.out.println(s);
	}

}

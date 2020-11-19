package by.ld.unit01.main;

public class Variables {
	public static void main(String[] args) {
		byte a = 5;
		short b = 0;
		int c = 60;
		long d = 0L;
		float e = 500.1f;
		double g = 0;
		boolean h = true;
		boolean j = false;
		char k = 'A';
		String m = "Катя";

		System.out.println(isSumValid(a, 200));
		System.out.println(getValueTerm(e, e, 20.6F, 5000.8F));
		printValue(0);
		System.out.println(isNeg(c));
		helloName(m);
		printYear(1200);
	}

	public static double getValueTerm(float a, float b, float c, float d) {
		return a * (b + c / d);
	}


	public static boolean isSumValid(int a, int b) {

		return (a + b) >= 10 && (a + b) <= 20;
	}

	public static void printValue(int a) {
		if (a >= 0) {
			System.out.println(a + " - положительное число");
		} else {
			System.out.println(a + "отрицательное число");
		}
	}

	public static boolean isNeg(int a) {
		return a < 0;
	}

	public static void helloName(String name) {

		System.out.println("Привет, " + name + "!");
	}

	public static void printYear(int a) {
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println(a + " - високосный год");
		} else {
			System.out.println(a + " - невисокосный год");
		}
	}
}
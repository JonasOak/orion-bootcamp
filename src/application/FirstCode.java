package application;

public class FirstCode {

	public static void main(String[] args) {

		long number1 = 1296;
		int number2 = 4;

		System.out.println(number1 + ", " + number2);
		
		while (number2 <= 2024) {
			
			long aux;

			aux = numberExtractor(number1) + plusNumber(number1) + predecessorExtractor(number2);
			number1 = aux * 100 + 96;
			number2 += 2;
			
			if (number2 <= 2024) {
				System.out.println(number1 + ", " + number2);
			}
		}
	}

	public static final long numberExtractor(long number) {

		long secondNumber = number / 100;
		return secondNumber;

	}

	public static final int plusNumber(long number) {

		int plus = 0;

		while (number > 0) {
			long digit = number % 10;
			plus += digit;
			number /= 10;
		}
		return plus;
	}

	public static final int predecessorExtractor(int number) {

		int plus = number;

		for (int i = number - 1; i >= 0; i--) {
			plus += i;
		}
		return plus;
	}

}

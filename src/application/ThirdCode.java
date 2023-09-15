package application;

import java.util.Scanner;

public class ThirdCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter a number N: ");
		int n = sc.nextInt();

		System.out.println(equilateralTriangle(n));
		
		System.out.println(printTriangle(n));

		sc.close();
	}

	public static String printTriangle(int number) {

		StringBuilder triangle = new StringBuilder();
		
		int j = number;

		System.out.println();
		while (j >= 0) {
			
			for (int i = j; i > 0; i--) {
				triangle.append("* ");
			}
			triangle.append("\n");
			j--;
		}

		return triangle.toString();
	}

	public static final int equilateralTriangle(int number) {

		int j = number;
		int plus = 0;

		while (j >= 0) {

			j--;
			number--;

			for (int i = number; i >= 0; i--) {
				plus += 1;
			}

		}

		int triangleNumber = plus;

		System.out.println();
		return triangleNumber;

	}

}

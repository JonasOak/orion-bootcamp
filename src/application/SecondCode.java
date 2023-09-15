package application;

public class SecondCode {

	public static void main(String[] args) {
		
		for (int i = 0; i < Math.pow(2, 6); i++) {
			String matrix = Integer.toBinaryString(i);
			
			while (matrix.length() < 6) {
				matrix = "0" + matrix;
			}
			
			System.out.println(matrix);
		}
		
	}

}
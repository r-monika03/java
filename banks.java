public class banks {
	public static void main(String[] args) {
			int rows = 5;  // Number of rows in the pyramid

			for (int i = 1; i <= rows; i++) {
					// Printing spaces
					for (int j = rows; j > i; j--) {
							System.out.print(" ");
					}
					// Printing stars
					for (int k = 1; k <= (2 * i - 1); k++) {
							System.out.print("*");
					}
					// Moving to the next line
					System.out.println();
			}
	}
}
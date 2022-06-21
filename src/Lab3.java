public class Lab3 {

	public static void main(String[] args) {

		drawTree('o', 3, 4);

		drawTree('*', 5, 3);

		drawTree('.', 7, 4);

	}

	public static void drawTree(char c, int segment, int height) {

		System.out.println();
		int artis = 0;
		int enalt = 2 * (segment + height) - 1;
		int taban = enalt / 2;

		for (int z = 0; z < segment; z++) {
			
			for (int a = 1; a <= height; a++) {

				for (int k = 0; k < enalt / 2; k++) {
					System.out.print(" ");
				}
				for (int i = 1; i <= 2 * a - 1 + artis; i++) {
					System.out.print(c);
				}

				System.out.println();
				enalt = enalt - 2;
			} // ikinci for
			artis = artis + 2;
			enalt = 2 * (segment + height -1) - 1 - z * 2;
		} // ilk for

		for (int t = 0; t < 2; t++) {
			for (int u = 0; u < taban; u++) {
				System.out.print(" ");
			} // ikinci for
			System.out.println(c);
		} // ilk for

		for (int bitti = 0; bitti < taban - 3; bitti++) {
			System.out.print(" ");
		}
		for (int ensonundabitti = 0; ensonundabitti < 7; ensonundabitti++) {
			System.out.print(c);
			
		}
		System.out.println();
		
	}
}

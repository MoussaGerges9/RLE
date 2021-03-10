package rle;

public class RLE {

	public static void main(String[] args) {
		String input = "mmmyo123###00";
		String compressedWord = "";

		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			int counter = 0;
			for (int j = i; j < input.length(); j++) {
				if (letter == input.charAt(j))
					counter++;
				else
					break;
			}

			input = input.substring(counter - 1);
			compressedWord += counter;
			compressedWord += letter;
		}

		System.out.println(compressedWord);
	}
}

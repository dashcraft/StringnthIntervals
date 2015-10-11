
import java.util.*;

public class StringNthIntervals {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		String input = stdin.next();

		int k = stdin.nextInt();

		int length = input.length() - (k - 1);

		String[] temp = new String[length];

		for (int i = 0; i < length; i++) {
			temp[i] = input.substring(i, k + i);
		}
		for (int c = 0; c < length - 1; c++) {
			for (int j = 0; j < length - 1 - c; j++) {
				if (temp[j].compareTo(temp[j + 1]) > 0) {
					String swap = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = swap;
				}
			}
		}
		System.out.println(temp[0]);
		System.out.println(temp[length - 1]);
	}
}
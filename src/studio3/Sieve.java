package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		int[] numbers = new int[limit - 1];
		
		for (int i = 0; i < limit - 1; i++) {
			numbers[i] = i + 2;
			System.out.print(numbers[i] + " ");
		}
		for(int i = 0; i <= Math.sqrt(limit); i++) {
			if(numbers[i] != 0) {
				for (int j = numbers[i]*numbers[i]; j < limit - 1; j = j + numbers[i]) {
				numbers[j] = 0;
			}
		}
		}
		for (int i = 0; i < limit - 1; i++) {
			numbers[i] = i + 2;
			System.out.print(numbers[i] + " ");

		}

	
	}
}	

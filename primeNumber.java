import java.util.Scanner;

// number divided by one or by itself only.

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number .");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int counter = 0;
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				counter = 1;
				;
				break;
			}
		}

		if (counter == 0)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}
}

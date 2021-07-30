import java.util.Scanner;

public class PerfectNumber {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		perfect(num);
		sc.close();

		if (sum == num) {

			System.out.println(num + " is a perfect number.");
		} else

			System.out.println(num + " is not a perfect number.");

	}

	public static int perfect(int num) {

		int i = 1;

		while (i <= num / 2) {
			if (num % i == 0)

				sum = sum + i;

			i++;
		}

		return sum;
	}
}
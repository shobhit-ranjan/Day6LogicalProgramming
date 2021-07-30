import java.util.Scanner;

//Reverse of a number.

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number .");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		//reverse(number);

		sc.close();
		
		System.out.println("Reversed Number is " + reverse(number));

	}

	public static int reverse(int num) {

		int reverse = 0;
		int remimder;

		while (num > 0) {

			remimder = num % 10;
			reverse = (reverse * 10) + remimder;
			num = num / 10;
		}
		//System.out.println("Reversed Number is " + reverse);
		return reverse;
	}
}

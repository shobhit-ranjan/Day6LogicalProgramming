
//Fibon is 0 and sec is 1  and so that 3rd term = 0+1 and so on
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number .");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		Fibonacci(number);

		sc.close();

	}

	public static void Fibonacci(int num) {
		int numOne = 0, numTwo = 1;

		int counter = 0;

		while (counter < num) {

			System.out.print(numOne + " ");

			// Swap
			int Temp = numTwo + numOne;
			numOne = numTwo;
			numTwo = Temp;
			counter = counter + 1;
		}
	}

}

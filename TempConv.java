import java.util.Scanner;

public abstract class TempConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Select 1 for Celsius to Fahrenheit ");
		System.out.println(" Select 2 for Fahrenheit to Celsius ");
		int num = sc.nextInt();
		Conversion(num);
		sc.close();

	}

	public static void Conversion(int n) {
		Scanner input = new Scanner(System.in);
		float oldTemp, newTemp;

	
		switch (n) {
		case 1:
			System.out.println("Please Enter Temperature in Celsius: ");
			oldTemp = input.nextFloat();
			newTemp = ((oldTemp * 9) / 5) + 32;
			System.out.println("Your Temperature is coverted in Fahreheit: " + newTemp);
			break;
		case 2:
			System.out.println("Please Enter Temperature in Fahreheit: ");
			oldTemp = input.nextFloat();
			newTemp = ((oldTemp - 32) * 5 / 9);
			System.out.println(" Your Temperature is converted in Celsius is: " + newTemp);
			break;

		default:
			System.out.println("Worng Input");
			break;
		}
		input.close();
	}
}
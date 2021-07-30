import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Your last 2 digit of Coupon Number.");
		int num = sc.nextInt();
		sc.close();
		coupon(num);

	}

	public static int coupon(int cNo) {

		if (cNo <= 99 && cNo >= 10) {
			Random random = new Random();

			for (int i = 0; i <= 50; i++) {
				int randomNum = random.nextInt(100);
				System.out.println(randomNum);
				if (randomNum == cNo) {
					System.out.println("You won a bike!!");
					break;

				}

			}

		
		} else {
			System.out.println("Invalid Coupon Number.. ");
		}
		return cNo;

	}

}

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Press any number to Start :");
		sc.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.print("Press any number to Stop :");
		sc.nextInt();
		sc.close();
		long finishTime = System.currentTimeMillis();
		long timeElapsed = (finishTime - startTime) / 1000;
		System.out.print("Time between two was in second: " + timeElapsed);
	}

}
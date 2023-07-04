package Transaction;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of transaction days:");
		int nod = sc.nextInt();

		int earnings[] = new int[nod];
		System.out.println("enter the transaction for:" + nod + " days");
		for (int i = 0; i < earnings.length; i++) {
			earnings[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(earnings));
		System.out.println("enter number of targets:");
		int targets = sc.nextInt();

		Target tg = new Target();
		tg.targetcheck(earnings, targets);
	}

}

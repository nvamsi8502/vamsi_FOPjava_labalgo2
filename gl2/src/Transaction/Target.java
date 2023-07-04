package Transaction;

import java.util.Scanner;

public class Target {

	public void targetcheck(int[] earnings, int targets) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= targets; i++) {

			System.out.println("please enter target:" + i);
			int target = sc.nextInt();
			int flag = 0, sum = 0;
			for (int j = 0; j < earnings.length; j++) {
				sum += earnings[j];
				if (sum >= target) {
					flag = 1;
					System.out.println("Taget achieved on day" + (j + 1));
					break;

				}

			}

			if (flag == 0) {
				System.out.println("Target not achieved");
			}
		}
	}

}

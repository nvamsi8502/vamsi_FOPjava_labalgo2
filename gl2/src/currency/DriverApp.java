package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of notes in your country");
		int numOfNotes = sc.nextInt();
		int[] currency = new int[numOfNotes];
		System.out.println("please enter the "+ numOfNotes+"Denominations");
		for(int i=0; i < currency.length; i++ ) {
			currency [i] = sc.nextInt();
			
		}
System.out.println("before sorting:" + Arrays.toString(currency));
		SelectionSort ss= new SelectionSort();
		ss.mySort(currency);
		System.out.println("after sorting:" + Arrays.toString(currency));
		System.out.println("enter the amount to exchange:");
		int amountToExchange = sc.nextInt();
		Notes note = new Notes();
		note.noteCount(currency, amountToExchange);
	}

}

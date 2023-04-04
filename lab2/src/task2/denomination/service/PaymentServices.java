package task2.denomination.service;

import java.util.Arrays;

public class PaymentServices {
	
	public static void Services(int currencyDenomination[] , int payment, int size) {
	Arrays.sort(currencyDenomination);
    int[] notesCount = new int[size];
    for (int i = size - 1; i >= 0; i--) {
        notesCount[i] = payment / currencyDenomination[i];
        payment = payment % currencyDenomination[i];
    }

    System.out.println("Your payment approach in order to give min no of notes will be:");
    for (int i = size - 1; i >= 0; i--) {
        if (notesCount[i] != 0) {
            System.out.println(currencyDenomination[i] + ":" + notesCount[i]);
        	}
     	}
	}
}

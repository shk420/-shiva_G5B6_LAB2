package task2.denomination.client;
import task2.denomination.service.*;
import java.util.*;

public class Payment {
	    public static void main(String[] args) {
	        Scanner inp = new Scanner(System.in);
	        System.out.println("Enter the size of currency denominations:");
	        int size = inp.nextInt();
	        int[] currencyDenomination = new int[size];
	        System.out.println("Enter the currency denominations value:");
	        for (int i = 0; i < size; i++) {
	            currencyDenomination[i] = inp.nextInt();
	        }
	        System.out.println("Enter the amount you want to pay:");
	        int payment = inp.nextInt();
	        PaymentServices.Services(currencyDenomination, payment, size);

	        
	    }
	}


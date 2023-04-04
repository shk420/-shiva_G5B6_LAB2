package task1.paymoney.client;
import task1.paymoney.service.*;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the size of transaction array\n");
        int size = inp.nextInt();
        int[] transactions = new int[size];
        System.out.print("enter the values of array\n");
        for (int i = 0; i < size; i++) {
            transactions[i] = inp.nextInt();
        }
        System.out.print("enter the total no of targets that needs to be achieved\n");
        int targets = inp.nextInt();
        for (int i = 0; i < targets; i++) {
            System.out.print("enter the value of target\n");
            int target = inp.nextInt();
            Services.TransactionServices(transactions , target, size);
        }

}
}

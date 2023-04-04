package task1.paymoney.service;
public class Services {
	
	public static void TransactionServices(int transactions[] , int target, int size) {
	
	int sum = 0;
    boolean t = false;
    for (int j = 0; j < size; j++) {
    	sum = sum + transactions[j];
    	if (sum >= target) {
    		System.out.println("Target is achieved after "+(j+1)+" transactions");
    		t = true;
    		break;
    	}
    	
    }
    if (t == false) {
    	System.out.println("Given target is not achieved ");
    	};

}
}
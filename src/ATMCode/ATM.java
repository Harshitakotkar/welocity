package ATMCode;

import java.util.Scanner;

public class ATM {
	
	public int accBalance = 2000;
	public boolean isAuth = false;
	
	public boolean Authenticate(int pin) {
		if(pin==1234) {
			return true;
		}
		return false;
	}
	
	public int withdraw(int amount) {
		accBalance -= amount;
		return accBalance;
	}
	public static void main(String[] args) throws BlockCard {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		while(attempts<3) {
			System.out.println("Enter PIN:");
			int pin = sc.nextInt();
			if(obj.Authenticate(pin)) {
				System.out.println("Valid pin");
				int currentBalance = obj.withdraw(500);
				System.out.println("Available Balance: "+currentBalance);
				break;
			} else {
				attempts++;
				if(attempts==3) {
					throw new BlockCard("Your card is blocked. Visit nearest branch to activate your card!");
				}
				System.out.println("Pswd enetered by you is Invalid, Remaining attempts: "+(3-attempts));
			}
		}
		
//		System.out.println("Valid Pin") : System.out.println("Invalid Pin");;
	}

}

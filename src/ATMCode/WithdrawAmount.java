package ATMCode;

import java.util.Scanner;

public class WithdrawAmount {
	int balance=3000;
int pin;	
int attempts=3;
Scanner sc=new Scanner(System.in);
	public void withdraw(int amount) throws BlockCard {
		while(attempts!=0) {
		System.out.println("enter pin");
		pin=sc.nextInt();
		if(pin==1235) {
	
			balance=balance-amount;
			System.out.println(balance);
			break;
		}else {
			attempts--;
			System.out.println("incorrect pin remaining attempts are"+attempts);
		}
		if(attempts==0) {
			throw (new BlockCard ("Your card is blocked. Visit nearest branch to activate your card"));
		
		}
		}
	}
	public static void main(String[] args) throws BlockCard {
		WithdrawAmount obj= new WithdrawAmount();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw amount");
	int amount=sc.nextInt();
	
		obj.withdraw(amount);
	}
	
	
}

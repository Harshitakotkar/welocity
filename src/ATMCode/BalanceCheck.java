package ATMCode;

import java.util.Scanner;

 public class BalanceCheck {
  int balance =3000;
	public boolean authenticate(int pin) {
	   if(pin==1233) {
		   return true;
   }
	return   false;
   }
   public int withdraw(int amount) {
		balance=balance-amount;
		return balance;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int attempts=1;
		 BalanceCheck obj=new  BalanceCheck();
		  while (attempts<=3) {
			 System.out.println("enter pin");
				int pin =sc.nextInt();
			if( obj.authenticate( pin)) {
				int balance=obj.withdraw(300);
				System.out.println("Available balance is=:"+balance);
				break;
				}else {
					System.out.println("invalid pin,left attempts are"+(3-attempts));
				}
			attempts++;
			if(attempts>3) {
				throw new  BlockCard("your card is blocked");
			}
			}
				
			}
		 }
		
	


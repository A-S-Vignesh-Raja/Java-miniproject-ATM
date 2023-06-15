import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		int pin = 1234;
		int balance = 20000;
		int deposit =0;
		int withdraw=0;
		int tamount=0;
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin number ");
		int password = sc.nextInt();
		if(password==pin) {
			System.out.println("Enter your Name ");
		    name=sc.next();
		    System.out.println("Hello "+name );
			while(true) {
				System.out.println("Press 1 to check your Balance ");
				System.out.println("Press 2 to Deposit amount into your account ");
				System.out.println("Press 3 to Withdraw amount from your account ");
				System.out.println("Press 4 to Transfer amount to another account ");
				System.out.println("Press 5 to get your Receipt ");
				System.out.println("Press 6 to EXIT!! ");
				int option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Your current Balance is "+balance);
					System.out.println();
					break;
				case 2:
					System.out.println("Enter the amount you need to deposit ");
					deposit = sc.nextInt();
					balance+=deposit;
					System.out.println("Rupees "+deposit+" have been deposited in your account");
					System.out.println();
					break;
				case 3:
					System.out.println("Enter the amount to be withdrawn ");
					withdraw = sc.nextInt();
					if(withdraw>balance){
						System.out.println("Insufficient Balance ");
						System.out.println();
					}
					else {
					balance-=withdraw;
					System.out.println("Rupees "+withdraw+" have been withdrawn from your account ");
					System.out.println();}
					break;
				case 4:
					System.out.println("Enter the Account Number to which you need to Transfer the amount ");
					int accno=sc.nextInt();
					System.out.println("Transferring Amount to "+accno+" Account number ");
					System.out.println("Enter the Amount that needs to be transferred to the Account");
				    tamount=sc.nextInt();
					balance-=tamount;
					System.out.println("Rupees "+tamount+" has been transferred to the Account ");
					System.out.println();
					break;
				case 5:
					System.out.println("***Welcome to our ATM***");
					System.out.println("Available Balance in your Account : "+balance);
					System.out.println("Amount withdrawn form your Account : "+withdraw);
					System.out.println("Amount deposited in your Account : "+deposit);
					System.out.println("Amount Transferred to other Accounts ; "+tamount);
					System.out.println("***Thank you for using our ATM***");
					System.out.println();
					break;
				}
				if(option==6) {
					System.out.println("Thank You ");
					System.out.println();
					break;
				}
			}
		}
		else {
			System.out.println("The Entered Pin number was wrong,Please Enter the Correct Pin Number ");
			System.out.println();
		}
		sc.close();

	}

}

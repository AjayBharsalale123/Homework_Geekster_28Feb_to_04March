package hw_oop;

//import BankAccount.BankAccount;
//import BankAccount.CheckingAccount;
//import BankAccount.SavingAccount;

//	public abstract class BankAccount {
//		
//		String customerName;
//		double balance;
//		String type;
//		static int numberOfAccounts;
//
//		public BankAccount() {
//			numberOfAccounts++;
//		}
//		public void printStatement()
//		{
//			//System.out.println("Balance : " + balance);
//		}
//
//		public void depositAmount(int amount)
//		{
//			balance = balance+amount;
//		}
//
//	}
	
	
	
//	public class CheckingAccount extends BankAccount {
//		
//		public CheckingAccount(String name, double balance) {
//			this.customerName = name;
//			this.balance = balance;
//			type = "Checking";
//		}
//
//		
//
//		public void withdrawAmount(int moneyToWithdraw)
//		{
//			if(moneyToWithdraw < balance)
//				balance = balance - moneyToWithdraw;
//		}
//	}
	
	
	
//	public class SavingAccount extends BankAccount {
//		
//		static int numOfSavingAcnt;
//
//		public SavingAccount() {
//			// TODO Auto-generated constructor stub
//
//		}
//		public SavingAccount(String name, double balance) 
//		{
//			this.customerName = name;
//			this.balance = balance;
//			type = "Savings";
//			numOfSavingAcnt++;
//		}
//
//	}

	
	
//	import java.util.Scanner;
//
//	public class BankMain {
//
//		public static void main(String[] args) {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Which Account you want to create :");
//			System.out.println("press 1 for saving account : press 2 for checking account");
//			int n = sc.nextInt();
//			BankAccount sObj = new SavingAccount();
//			CheckingAccount cObj = new CheckingAccount("aj",100);
//			
//			switch(n) {
//			case 1:
//				BankAccount s1Obj = new SavingAccount();
//				System.out.println("Enter Saving Account Customer name and Balance :");
//				String name = sc.nextLine();
//				sc.nextLine();
//				int b = sc.nextInt();			
//				s1Obj.printStatement();
//				break;
//				
//			case 2:
//				System.out.println("Enter Current Account Customer Name and Balance :");
//				String nm=sc.nextLine();
//				sc.nextLine();
//				int bc=sc.nextInt();
//				cObj.printStatement();
//				break;
//				
//			default:
//				System.out.println("exit");
//				break;
//				
//			}
//			
//			System.out.println("Number of accounts created = " +BankAccount.numberOfAccounts);
//			System.out.println("Number of savings accounts created = " +SavingAccount.numOfSavingAcnt);
//			
//			
//			BankAccount[] b  = new BankAccount[2];
//			b[0] = cObj;
//			b[1] = sObj;
//
//			for(int i =0; i< 2;i++)
//			{
//				b[i].printStatement();
//			}
//			
//			
//			
//	     
//			      
//
//
//		}
//
//
//	}
//	     
//
//

//}








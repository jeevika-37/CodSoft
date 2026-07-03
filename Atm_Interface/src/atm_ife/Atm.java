package atm_ife;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Initial Balance");
	    double balAmt=sc.nextDouble();
	    BankAccount acc=new BankAccount(balAmt);
	    int choice;
	    do
	    {
	    	System.out.println("1.Deposit"); 
		    System.out.println("2.Withdraw  ");
		    System.out.println("3.Check Balance");
		    System.out.println("4.Exit");
		    System.out.println("Enter Your Choice ");
		    choice= sc.nextInt();
		    switch(choice)
		    {
		    case 1:
		    	System.out.println("Enter Deposit Amount :");
		    	double d=sc.nextDouble();
		    	acc.deposit(d);
		    	break;
		    case 2:
		    	System.out.println("Enter Withdraw Amount :");
		    	double w=sc.nextDouble();
		    	acc.withdraw(w); 
		    	break;
		    case 3:
		    	acc.checkbalance();
		    	break;
		    case 4:
		    	System.out.println("Exited!");
		    	break;
		    default:
		    	System.out.println("Invalid choice!");
		    }
	    }while(choice!=4);
	    sc.close();
	}
}

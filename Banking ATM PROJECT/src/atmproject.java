import java.util.Scanner;
public class atmproject 
{
   public static void main(String[] args) {
	Bankaccount obj1 = new Bankaccount(" Sparsh", "BA0002");
	obj1.showMenu();
	
}
}
class Bankaccount
{
	int balance;
	int previoustransaction;
	String customername;
	String customerid;
	
	Bankaccount(String cname , String cid)
	{
		customername  = cname;
		customerid = cid;
		
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previoustransaction =amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
		    previoustransaction = -amount;
		}
	}
	
	void getprevioustransaction()
	{
		if(previoustransaction >0) {
			System.out.println("Deposited:"+previoustransaction);
		}
		else if(previoustransaction <0)
		{
			System.out.println("withdraw:"+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("No transaction occurd");
		}
	}
    void showMenu()
    {
    	char option ='\0';
    	Scanner scanner  = new Scanner(System.in);
    	System.out.println("Welcome to virtual ATM"+customername);
    	System.out.println("Your id is"+customerid);
    	System.out.println("\n");
    	System.out.println("a. check your Balance");
    	System.out.println("b. Deposit your money");
    	System.out.println("c. withdraw your money");
    	System.out.println("d. check your previous Transactoin");
    	System.out.println("e. you can Exit");
    
    do
    {
    	System.out.println("*********************************************");
    	System.out.println("Enter your choose option");
    	System.out.println("*********************************************");
        option = scanner.next().charAt(0);
        System.out.println("\n");		
    
        switch(option)
        {
        case 'a':
         System.out.println("********************************************");
         System.out.println(" Current Balance isa "+balance);
        System.out.println("********************************************");
       System.out.println("\n");
        break;
        
        case 'b':
        	 System.out.println("********************************************");
             System.out.println("Enter deposite amount:");
             System.out.println("********************************************");
        int amount = scanner.nextInt();
        deposit(amount);
        System.out.println("\n");
        break;
        
        case 'c':
        	 System.out.println("********************************************");
            System.out.println("Enter withdraw amount");
            System.out.println("********************************************");
         int amount2 = scanner.nextInt();
        withdraw(amount2);
        System.out.println("\n");
        break;
    
        
        case 'd':
        	
        	System.out.println("********************************************");
           getprevioustransaction();
           System.out.println("********************************************");
           System.out.println("\n");
            break;
        case 'e':
        	System.out.println("********************************************");
            
            default:
            	System.out.println("Invalid option!please choose correct option");
                break;
        }
        
    }while(option != 'e');
    System.out.println("Thank you for choosing Us");
    
    
    
    }
    }


    
    
    
    
    
    
    	
    
    






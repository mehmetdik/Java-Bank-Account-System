import java.util.Scanner;


public class islemler {



	
	
	public static int balance(int money)
	{
		System.out.println("Balance="+money);
		return money;
	}
	
	
	
	
	public static int deposit(int money,int deposit)
	{
		Scanner scan1 =new Scanner(System.in);
		System.out.println("Balance:"+money);
		System.out.print("Deposit required Quantity:");
		deposit=scan1.nextInt();
		money=money+deposit;
		System.out.print("Balance="+money);
		return  money;
	}

	
	
	public static int withdrawmoney(int money,int withdrawn)
	{
		Scanner scan2=new Scanner(System.in);
		System.out.print("Balance:"+money);
		System.out.print("\nTo be withdrawn:");
		withdrawn=scan2.nextInt();
		if (withdrawn<=money) 
		{
			money=money-withdrawn;
			System.out.print("Balance="+money);
			
		}
		else
		{
			System.out.println("Insufficient balance.");
		}


		return money;
	}

	
	
	public static int transfer(int money,int moneytobesent,int accountno)
	{
		Scanner scan3=new Scanner(System.in);
		System.out.print("Balance:"+money);
		System.out.print("\nNaccount no:");
		accountno=scan3.nextInt();
		System.out.print("\nMoney to be transferred:");
		moneytobesent=scan3.nextInt();
		if (moneytobesent<=money)
		{
			money=money-moneytobesent;
			
			System.out.print("\nBalance:"+money);
		}
		else
		{
			System.out.println("Insufficient balance.");
		}
		
		return money;
	}
	
	
	
	public static int exit()
	{
		System.out.println("Your output from the system");
		return 0;
	}




}

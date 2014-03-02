import java.util.Scanner;


public class Bankahesapsistemi {


	public static void main(String[] args)
	{
		try {
			int money=1000,choice,deposit=0,withdrawn=0,moneytobesent=0,accountno=0;
			String password="1234",username="mehmet",password2="",username2="",choice3="";
			Scanner scan=new Scanner(System.in);
			System.out.println("                           DIKBANK");
			System.out.print("User Name:");
			username2=scan.nextLine();
			System.out.print("Password:");
			password2=scan.nextLine();
			if (username.equalsIgnoreCase(username2) && password.equalsIgnoreCase(password2)) 
			{
				do{
					System.out.print("1-Balance Inquiry\n2-Deposit\n3-Withdrawals\n4-Transfer\n5-Exit\n");
					System.out.print("Choice=");
					choice=scan.nextInt();
					if (choice==1)
					{
						islemler.balance(money);


					}
					else if (choice==2)
					{
						money = islemler.deposit(money,deposit);
					}
					else if (choice==3)
					{
						money = islemler.withdrawmoney(money,withdrawn);
					}
					else if (choice==4)
					{
						money = islemler.transfer(money,moneytobesent,accountno);
					}
					else if (choice==5)
					{
						islemler.exit();
					}
					else {
						System.out.println("Incorrect choice.");
						main(args);
					}
					for (;;) 
					{
						Scanner scan4=new Scanner(System.in);
						System.out.println("\nDo you want to make another transaction?(y/n)");
						choice3=scan4.nextLine();
						if (choice3.equalsIgnoreCase("y") || choice3.equalsIgnoreCase("n"))
						{
							break;
						}
						else
						{
							System.out.println("LOGIN wrong.");

						}

					}
				}while(choice3.equals("y"));

			}
			else
			{
				System.out.println("Username or password incorrect.");
				main(args);
			}

		} catch (Exception e) {
			System.out.println("Please check transactions.");
			main(args);
		}

	}





}

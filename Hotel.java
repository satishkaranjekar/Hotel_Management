import java.util.Scanner;

class Hotel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------Welcome To Sahyadri Hotel!---------------");
		
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		System.out.println("Select your option: ");
		int op=sc.nextInt();
		
		switch(op)
		{
			case 1:
			{
				System.out.println("----------Veg Menu------------");
				System.out.println("1. Upma----->20.00");
				System.out.println("2. Poha----->20.00");
				System.out.println("3. Dosa----->60.00");
				System.out.println("4. Idli----->30.00");
				System.out.println("Select your option: ");
				
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					case 2:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*20));
						break;
					}
					case 3:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*60));
						break;
					}
					case 4:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*30));
						break;
					}
					default:
					{
						System.out.println("Invalid Input");
					}
				}
				break;
			}
			case 2:
				{
				System.out.println("----------Non-Veg Menu------------");
				System.out.println("1. Omlet----->40.00");
				System.out.println("2. Chiken-65----->160.00");
				System.out.println("3. Mutton biryani----->500.00");
				System.out.println("4. Fish Fry----->450.00");
				System.out.println("Select your option: ");
				
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*40));
						break;
					}
					case 2:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*160));
						break;
					}
					case 3:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*500));
						break;
					}
					case 4:
					{
						System.out.println("Enter the number of plates");
						int no=sc.nextInt();
						System.out.println("Amount Payble: "+(no*450));
						break;
					}
					default:
					{
						System.out.println("Invalid Input");
					}
				}
				break;
			}
			default:
			{
				System.out.println("Select only from Menu...!");
			}
	    }
		
		
	}
}

package com.orderexp;
//This program can store your order, display all your order or search any order
public class OrderTest {
	static int st;
	private static java.util.Scanner m,n,t;

	public static void main(String[] args) {
		m = new java.util.Scanner(System.in);
		n = new java.util.Scanner(System.in);
		t = new java.util.Scanner(System.in);
		String decision=null;
		System.out.println("Enter maximum no of products:");
		int pn=m.nextInt();
		st=pn;
		Order order[];
		Order operations = new Order();
		
		order=new Order[pn];
		int i=0;
		//String ck="y";
		do
		{
			System.out.println("Enter operations: 1.>Store 2.> Display 3.> Search");
			String option = t.next();
			switch(option)
			{
			case "store":
				while(i<pn)
				{
						order[i]= new Order();				
						//int id=m.nextInt();
						int x=1001+i;
						System.out.println("Enter price of product");
						double price=m.nextDouble();
						System.out.println("Enter name of product");
						String name=n.nextLine();
						order[i].setter(x, price, name);
						System.out.println("Order added sucessfully");
						operations.StoreOrders(order[i]);
						i++;
						System.out.println("Order Stored:"+i+"\nType "+(i+1)+" to store order no. "+(i+1)+" OR Type 0 to exit storing order");			
						//ck=c.next();
						st=pn;
						pn=m.nextInt();
						//st=pn;
						
						if(pn==0)
							break;
				}
				break;
			case "display":operations.display();
			break;
			case "search":
				System.out.println("Enter order ID to search:");
			int sid=m.nextInt();
			operations.searchorder(sid);
			break;
			default:System.out.println("No more options available");
			}
			System.out.println("Do you want to continue it!(y/n)");
			decision = t.next();

	}
		while(decision.equals("y"));
		operations.display();
}
}
//how to check where the function is lagging.
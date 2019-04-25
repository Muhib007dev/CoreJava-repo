package com.orderexp;

public class Order extends OrderTest {
	int ordid;
	double ordprice;
	String ordname;
	Order[] orders=new Order[st];//try to use final concept here to fix i value in interface and try to use scanner in it too.
	int counter=0;
	

	void setter(int ordid, double ordprice, String ordname)
	{
		this.ordid=ordid;
		this.ordprice=ordprice;
		this.ordname=ordname;
	}
	
	void StoreOrders(Order order)
	{
		
		orders[counter]=order;
		counter++;
	}

	void display()
	{
		for(int i=0;i<st;i++)
		{
			System.out.println("Order no."+(i+1));
			System.out.println(orders[i].ordid);
			System.out.println(orders[i].ordprice);
			System.out.println(orders[i].ordname+"\n");
		}
	}
	
	void searchorder(int id)
	{
		for(int i=0;i<st;i++)
		{
			if(orders[i].ordid==id)
			{
				System.out.println("Debug size of array:"+st);
				System.out.println(orders[i].ordid);
				System.out.println(orders[i].ordprice);
				System.out.println(orders[i].ordname);
			}
		}
		System.out.println("If the details of your entered id didnt displayed please check it again.");
	}
}

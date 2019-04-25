package com.conceptthreadingandmultithreading;

class Product implements Runnable{

	public void run() {
		for(int i=1;i<=200;i++){
			System.out.println("Product run..."+i);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	    }
		void printSeries(){
			for(int i=1;i<=20;i++){
			System.out.println("product series:"+i);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
}

class Order extends Thread{

	@Override
	public void run() {
		
		for(int i=1;i<=20;i++){
		System.out.println("Order run..."+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	void printSeries(){

		for(int i=1;i<=20;i++){
		System.out.println("series:"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	} 
}

public class ProductThread {

	public static void main(String[] args) {	
		
		// thread object
		Order order = new Order();
		//order.run();
		order.start();
		order.printSeries();
		
		/*Product product = new Product();
		Thread thread = new Thread(product);
		thread.start();
		product.printSeries();
*/		
		
				
		}
}


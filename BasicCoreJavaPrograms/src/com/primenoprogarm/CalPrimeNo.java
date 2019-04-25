package com.primenoprogarm;

public class CalPrimeNo {
	public CalPrimeNo(int no) {
		for(int i=2 ;i<Math.sqrt(no);i++)
		{
			if(no%i==0){
				System.out.println("not prime");
				break;
			}
			else
			{
				System.out.println("prime");
				break;
			}
		}
	}

}

package com.primenoprogarm;

public class TestPrimeNo {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int no = scan.nextInt();
		CalPrimeNo calPrimeNo = new CalPrimeNo(no);
		scan.close();

	}

}

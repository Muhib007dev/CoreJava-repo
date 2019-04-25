package com.codearenaprogram;
//Bob and Khatki recently started a business. They sell computers at moderate rates. To grow their business they need to know which company’s laptops are in demand. You are given description of N laptops which are sold out. Each laptop is described by their company name. Can you help them figure out which company’s laptops are in demand. The company in demand is the one whose laptops are being sold more. If there are multiple such companies print the one which is lexicographically smallest.
//Input:
//First line of input contains N, number of responses of people. Next N lines contains company name of laptop.
//Output:
//Print the company name people preferred most. In case of tie print the lexographically smallest answer.
//Constraints:
//1 &le N = 105



// SAMPLE input:- 5 DELL DELL HP DELL LENOVO
//SAMPLE output:- DELL
public class TestDataCheck {

	public static void main(String[] args) {
		new DataCheck() {
			
			@Override
			public void cal() {
				java.util.Scanner scan = new java.util.Scanner(System.in);
				java.util.Scanner scan1 = new java.util.Scanner(System.in);
				int num = scan.nextInt();
				String[] input = new String[num];
				for(int i=0;i<num;i++)
				{
					String cmpny = scan1.nextLine();
					
					input[i]=cmpny;
				}
				String[] check=new String[num];
			
				for(int k=0;k<num;k++)
				{int i=k;
					check[k]=input[i];
					i++;	
				}
				int[] counter= new int[num];
				for(int k=0;k<num;k++)
				{
					counter[k]=0;
				}
				for(int k=0;k<num;k++)
				{
					for(int i=0;i<num;i++)
					{
						if(check[k].equals(input[i]))
						{	
							counter[k]++;
						}					
						
					}
				}
				
				int largest=counter[0];
				for(int i=0;i<num;i++)
				{
					if(largest<counter[i])
						largest=counter[i];
				}
				
				for(int i=0;i<num;i++)
				{
					if(counter[i]==largest)
					{
						System.out.println(check[i]);
						break;
					}
						
				}
					scan.close();
					scan1.close();
			}
		}.cal();

	}

}

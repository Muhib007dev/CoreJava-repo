package com.codearenaprogarm3;

public class TestLogic {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int set = scan.nextInt();
		int[] a = new int[set];
		
		for(int i=0;i<set;i++)
		{
			
			int in = scan.nextInt();
			a[i]=in;
		}
		int[] counter=new int[set];
		for(int i=0;i<set;i++)
		{
			for (int j = 0; j < set; j++) {
				if(a[i]==a[j])
				{
					counter[i]++;
				}
				
			}
		}
		int countertest = 0;
		for(int i=0;i<set;i++)
		{
			if(counter[i]==1)
			{
				System.out.println(a[i]);
			}
			else if(counter[i]>1)
			{
				countertest++;
			}
		}

		if(countertest==set)
		{
			System.out.println(-1);
		}
	}

}

package com.codearenaprogram4;

public class Isogram {
	public static boolean isIsogram(String str)
	{
		/*int check=str.length();
		
		int counter=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i)+"<-i j->"+str.charAt(j));
					counter++;
					System.out.println(counter);
				}
			}
		}
		System.out.println(counter);
		if(counter==check)
		return true;
		else 
		return false;*/
		
		
				String lstr= str.toLowerCase();
				long len = lstr.chars().distinct().count();
				
				return str.length() == len;
		
		
			
	}
	

}

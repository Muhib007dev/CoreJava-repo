package com.conceptfilehandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare extends TestFile{
	public Compare() throws IOException {
		File file = new File("E://DAAC//filehandlingdata//mecks.txt");
		File file2 = new File("E://DAAC//filehandlingdata//neckster.txt");
		System.out.println("testbug");
		if(file.exists()&file2.exists());
		{
			FileReader fileReader = new FileReader(file);
			FileReader fileReader2 = new FileReader(file2);
			boolean flag = false;
			
			int x=0;
			int y=0;
			char []data = new char[100];
			char []data1 = new char[100];
				while((x = fileReader.read())!=-1 && (y = fileReader2.read())!=-1){
					if(x == y)
						flag =true;
					else
						break;
				}
				System.out.println("bug");
				
				if(flag==true){
					System.out.println("equall");
				}
				else
				{
					System.out.println("not equall");
				}
				/*
				if(fileReader.read()==fileReader2.read())
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("fail");
				}*/
			/*
				while((x = fileReader2.read())!=-1){
					int i =0;
					//System.out.print((char)x);
					char input = (char)x;
					data1[i]=input;
					//System.out.print(data1[i]);
					i++;
				}*/
			/*	String str = String.valueOf(data);
				System.out.println(str);*/
				fileReader2.close();
				fileReader.close();
				
				

			
		}
		
	}

}

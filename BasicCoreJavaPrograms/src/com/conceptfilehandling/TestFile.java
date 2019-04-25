package com.conceptfilehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
	void writeData() throws IOException {
		//opening the file
		FileWriter fileWriter = new FileWriter("E://DAAC//filehandlingdata//mecks.txt");
		FileWriter fileWriter2 = new FileWriter("E://DAAC//filehandlingdata//neckster.txt");
		FileWriter fileWriter3 = new FileWriter("E://DAAC//filehandlingdata//oecks.txt");
		//read or write file
		fileWriter.write("Welcome to file handling..");
		
		fileWriter2.write("Welcome to file handling..");
		fileWriter3.write("NULL");
		System.out.println("Data written to the file");
		System.out.println("mightbug");
		
		//close the stream
		fileWriter.close();
		fileWriter2.close();
	}
	

	void readData() throws IOException {
		File file = new File("E://DAAC//filehandlingdata//mecks.txt");
		File file2 = new File("E://DAAC//filehandlingdata//neckster.txt");
		File file3 = new File("E://DAAC//filehandlingdata//oecks.txt");
		int x;
		
		if(file.exists()){
			FileReader fileReader = new FileReader("E://DAAC//filehandlingdata//mecks.txt");
			
			while((x = fileReader.read())!=0){
				//System.out.print((char)x);//temp
			
			}
			fileReader.close();
		}
		else
		{
			System.out.println("file not exist");
		}
		//System.out.println("\n"+(char)data);
		/*System.out.println(file.list());
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		if(file2.compareTo(file)==1);
		*/
	}

}

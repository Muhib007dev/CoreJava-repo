package com.conceptfilehandling;

import java.io.File;
import java.io.IOException;


public class TestFileHandling  {

	public static void main(String[] args) throws IOException {
		TestFile file = new TestFile();
		file.writeData();
		file.readData();
		System.out.println("bug");
		Compare compare = new Compare();
	}

}

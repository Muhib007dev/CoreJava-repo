package com.conceptserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.FileChannel;

public class TestSerializeInterface {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(1001, "Muhib");
		//FileWriter fileWriter = new FileWriter("E://DAAC//filehandlingdata//byteseries.txt"); ?why this class object is not working in objectoutputstream constructor?
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(FileWriter);
		FileOutputStream fileOutputStream = new FileOutputStream("E://DAAC//filehandlingdata//serializationfile.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream());
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		
		Employee employee2 = null;
		
		FileInputStream fileInputStream = new FileInputStream("E://DAAC//filehandlingdata//serializationfile.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		employee2 = (Employee)inputStream.readObject();
		
		
		employee2.displayObjectDetails();
		inputStream.close();
		//ConceptOfFileChannel channel = new ConceptOfFileChannel();	
		/*System.out.println(channel.getClass());
		System.out.println(channel.hashCode());*/
	}
}

package com.conceptserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ConceptOfFileChannel {
	public ConceptOfFileChannel() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("E://DAAC//filehandlingdata//byteseries.txt");
		byte[] b = {'a','b','c','d'};
		fileOutputStream.write(b);
		//fileOutputStream.flush();
		byte[] c = {'a'};
		fileOutputStream.write(c );
		FileChannel  a = fileOutputStream.getChannel();
		long pos = a.position();
		System.out.println(pos);

	}
}

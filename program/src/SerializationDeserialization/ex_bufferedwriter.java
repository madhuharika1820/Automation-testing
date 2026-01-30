package SerializationDeserialization;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex_bufferedwriter {
public static void main(String[] args)
{
	try {
		BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
		writer.write("good morning");
		writer.newLine();
		writer.write("my name is madhu "+"harika "+"yerroju");
		writer.close();
		System.out.println("file written successfully");
	
	}
	catch(IOException e)
	{
		System.out.println("an error occured: "+e.getMessage());
	}
}
}

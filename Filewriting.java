package javalab;
import java.io.FileWriter;
import java.io.IOException;
public class Filewriting {
public static void main(String [] args) throws IOException{
	FileWriter fw=new FileWriter("input.txt");
	fw.write("file handling java program");
	fw.close();
	System.out.println("file written successfully");
}
}

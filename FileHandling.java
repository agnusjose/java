package javalab;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class FileHandling {
public static void main(String [] args) throws Exception{
	char [] data=new char[50];
	FileReader fr=null;
	FileWriter fw=null;
	try {
	 fr=new FileReader("input.txt");
	int len=fr.read(data);
	System.out.println(data);
	fr.close();
	fw=new FileWriter("output.txt");
	fw.write(data,0,len);
	fw.close();
	fw.flush();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}

//copy the content of a file to another file
import java.io.*;
public class SlipTest9 {
	public static void main(String[] args) throws Exception {
	File infile = new File("C:\\sunil\\biodata.txt");
	File outfile= new File("C:\\sunil\\resume.txt");
	FileInputStream reader = new FileInputStream(infile);
	FileOutputStream writer = new FileOutputStream(outfile);
	int i;
		while((i=reader.read())!=-1) {			
			writer.write((char)i);			
		}
		System.out.println("File copied");
	}
}

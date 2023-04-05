//creating a binary file student.dat
import java.io.*;
public class Test26 {
	public static void main(String[] args) throws Exception{
       File f=new File("C:\\4CS7\\student.dat");
       FileOutputStream out=new FileOutputStream(f,true);
       System.out.println("binary file created");
	}

}

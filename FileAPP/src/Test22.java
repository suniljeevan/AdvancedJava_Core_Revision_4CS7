//creating a text file to keep notes on multithreading
import java.io.*;
public class Test22 {
	public static void main(String[] args)throws Exception {
    File ob = new File("C:\\sunil\\multithread.txt");
    String essay="multithreading is creating many threads\nThis is concurrent programming\n There are 2 ways to create threads\n Extending Thread, Implementing Runnable";
    FileWriter fw = new FileWriter(ob);
   fw.write(essay);
   fw.close();
   System.out.println("1 file created and written");
	}

}

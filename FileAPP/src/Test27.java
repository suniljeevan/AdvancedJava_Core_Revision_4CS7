//writing to binary file
//20211CSE0837 compulsory fail
import java.io.*;
import java.util.Scanner;
public class Test27 {
	public static void main(String[] args)throws Exception {
      File f=new File("C:\\4CS7\\student.dat");
      FileOutputStream out=new FileOutputStream(f,true);
      String nextline=new String();
      String name;
      int regdno;
      String assn_sub;
      char stop='n';
      Scanner sc=new Scanner(System.in);
      do {
      System.out.println("enter name");
      name=sc.next();
      System.out.println("enter regdno");
      regdno=sc.nextInt();
 System.out.println("yes/no assignment submitted/not");
      assn_sub=sc.next();
      String record=nextline.concat("\n").
    		  concat(name).concat(" ").
    		  concat(String.valueOf(regdno).
    		  concat(" ").concat(assn_sub));
      out.write(record.getBytes());
      System.out.println(" enter y to stop ");
      stop=sc.next().charAt(0);
      }while(stop!='y');
  System.out.println("Records written to binary file");
	}
}

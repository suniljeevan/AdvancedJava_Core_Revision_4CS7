//creating a folder
import java.io.*;
import java.util.*;
public class Test20 {
	public static void main(String[] args) throws Exception{
       String foldername;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of folder");
       foldername=sc.next();
       File f=new File("images\\"+foldername);
       if(f.mkdir()==true) 
    	   System.out.println("folder created in path ");
       else
    	   System.out.println("error in creating folder");
	}

}

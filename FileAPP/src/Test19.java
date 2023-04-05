//check the details of a file in c drive
import java.io.*;
public class Test19 {
	public static void main(String[] args) {
        File f=new File("C:\\anil");
        System.out.println("present or not:"+f.exists());
        System.out.println("abs path:"+f.getAbsolutePath());
        System.out.println("rel path:"+f.getPath());
        System.out.println("parent:"+f.getParent());
        System.out.println("last changed:"+f.lastModified());
	}

}

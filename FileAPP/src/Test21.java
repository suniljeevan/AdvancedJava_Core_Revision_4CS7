import java.io.File;
//creating folder at current working directory
public class Test21 {
	public static void main(String[] args) throws Exception{
		String foldername="data";
		for(int i=1;i<=100;i++) {
		File f=new File(foldername+i);
		if(f.mkdir()==true)
		System.out.println("folder created at relative path");
		else 
			System.out.println("error");
		}

	}

}

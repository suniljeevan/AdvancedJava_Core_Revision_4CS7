import java.io.*;
// Testing checked-exception
public class Test8 {
	public static void main(String[] args) throws Exception {
		File ob = new File("C:\\sunil\\biodata.txt");
        FileReader reader = new FileReader(ob);
        BufferedReader br = new BufferedReader(reader);
        String s;
        while((s=br.readLine())!=null) {
        	System.out.println(s);
        }
	}

}

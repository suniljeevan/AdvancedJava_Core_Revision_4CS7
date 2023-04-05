//Read the content of the file to output console.
import java.io.*;
public class Test23 {
	public static void main(String[] args)throws Exception {
      File ob=new File("C:\\sunil\\multithread.txt");
      //FileReader reads one letter at a time 
      //BufferedReader reads one sentence at a time
      FileReader fr=new FileReader(ob);
      BufferedReader br = new BufferedReader(fr);
      String sentence;
      while((sentence=br.readLine())!=null) {
    	  System.out.println(sentence);
      }
      
	}

}

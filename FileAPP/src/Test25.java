//counting no. of words, sents, characters in a file
import java.io.*;
public class Test25 {
	public static void main(String[] args)throws Exception {
       File f=new File("C:\\sunil\\multithread.txt");
       FileReader fr=new FileReader(f);
       BufferedReader br=new BufferedReader(fr);
       String line;
       int no_of_chars=0;
       int no_of_words=0;
       int no_of_sents=0;
       while((line=br.readLine())!=null) {
    	   no_of_chars+=line.length();
    	   String words[]=line.split("\\s+");
    	   no_of_words+=words.length;
    	   String sents[] = line.split("[\n]+");
    	   no_of_sents+=sents.length;
    	   System.out.println(no_of_sents+" "+line);
       }
       br.close();
       System.out.println("No. of characters "+no_of_chars);
       System.out.println("No. of words "+no_of_words);
       System.out.println("No. of sentences "+no_of_sents);
       
	}

}

//copying file 
import java.io.*;
public class Test24 {
public static void main(String[] args) throws Exception{
 File source = new File("C:\\sunil\\multithread.txt");
 File target=new File("C:\\sunil\\multithread_copy.txt");
 FileReader fr=new FileReader(source);
 BufferedReader br=new BufferedReader(fr);
 FileWriter fw=new FileWriter(target);
 BufferedWriter bw=new BufferedWriter(fw);
 String sent;
 while((sent=br.readLine())!=null) {
	 bw.write(sent);
	 bw.newLine();
 }
 bw.close();
 br.close();
 System.out.println(" 1 file copied");
 File d=new File("C:\\Users\\india-1\\eclipse-workspace-JavaRevision4cs7\\FileAPP");
 String folder[]=d.list();
 File files[] = d.listFiles();
 for(int i=0;i<folder.length;i++) {
	 if(folder[i].substring(0, 3).equals("dat"))
		 files[i].delete();
		 
 }
 
	}

   }



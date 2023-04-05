import java.io.*;
public class Test29 {
public static void main(String [] args) throws Exception {
Student s = null;
FileInputStream fileIn = 
new FileInputStream("C:\\sunil\\students.ser");
ObjectInputStream in = new ObjectInputStream(fileIn);
s = (Student) in.readObject();
in.close();
fileIn.close();
System.out.println("Deserialized Student...");
System.out.println("Name: " + s.name);
System.out.println("Regd no: " + s.regdno);
System.out.println("CGPA: " + s.cgpa);
}
}

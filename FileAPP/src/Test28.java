import java.io.*;
import java.io.Serializable;
class Student implements Serializable {
String name;
String regdno;
double cgpa;
}
public class Test28 {
public static void main(String [] args) throws Exception {
Student s = new Student();
s.name = "sanjay";
s.regdno = "20213cse0123";
s.cgpa = 7.5;
FileOutputStream fileOut =new FileOutputStream("C:\\sunil\\students.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(s);
out.close();
fileOut.close();
System.out.println("Serialized data is saved in students.ser");
}
}

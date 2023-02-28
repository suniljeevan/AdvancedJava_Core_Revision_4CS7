import java.util.Scanner;

interface Geoshape {
	public void area();  //abstract by default
	public void volume();  // abstract by default
}
class Geocircle implements Geoshape {
	public void area() {
		double r=9.6;
		System.out.println("Circle area is:");
		System.out.print(3.14*r*r);
	}
	public void volume() { }
}
class Geosphere implements Geoshape {
	public void area() {} 
	public void volume() {
		double r=3.2;
		System.out.println("volume of sphere is");
		System.out.println(4.0/3.141*r*r*r);
	}
}

public class Test6 {
	public static void main(String[] args) {
      int dimension;
      Geoshape s;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter dimension 2 or 3");
      dimension=sc.nextInt();
      if(dimension==2) {
    	  s=new Geocircle();
    	  s.area();
      }else {
    	  s=new Geosphere();
    	  s.volume();
      }

	}

}

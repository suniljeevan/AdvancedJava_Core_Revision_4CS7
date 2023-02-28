import java.util.Scanner;

//Testing abstract class 
//the class which can't be instantiated/no object
//derived class of abstract class is mandatory
abstract class shape {
	abstract void area();//method has body
}  
class circl extends shape {
	void area() {
		double r=4.5;
		System.out.print(3.14*r*r);
	}
}
class rectangle extends shape {
	void area() {
		double length=5.5,breadth=6.2;
		System.out.println(length*breadth);
	}
}
class square extends shape {
	void area() {
		double side=4.5;
		System.out.println(Math.pow(side, side));
	}
}
class triangle extends shape {
	void area() {
		double base=0.6,height=0.7;
		System.out.println(0.5*base*height);
	}
}

	public class Test5 {
	public static void main(String[] args) {
     int choice;
     shape s;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 1,2,3 or 4");
     choice=sc.nextInt();
     switch(choice) {
     case 1:
    	 s=new circl();
    	 s.area();break;
     case 2:
    	 s=new rectangle();
    	 s.area();break;
     case 3:
    	 s=new square();
    	 s.area();break;
     case 4:
    	 s=new triangle();
    	 s.area();
    }
	}
}

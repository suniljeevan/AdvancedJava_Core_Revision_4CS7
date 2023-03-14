//Demonstrate  Thread class
//20211CSE0853,20211cse0801
class sample extends Thread {
	
	public void run() {
		System.out.println("welcome");
	}	
}
public class Test11 {
	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		sample ob1=new sample();
		sample ob2=new sample();
		sample ob3=new sample();
		sample ob4=new sample();
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
		Thread.sleep(10000);
		System.out.println("bye");

	}

}

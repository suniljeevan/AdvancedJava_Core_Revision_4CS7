//create 3 threads to print both 
//welcome and presidency concurrently
//give name to each thread first,second,third
class PrintThread extends Thread {
	String name;
	PrintThread(String name) {
		this.name=name;
		System.out.println(name +" thread created");
	}
	public void run() {
		try {
			System.out.println("welcome");
			Thread.sleep(3000);
			System.out.println("presidency");
		}catch(Exception e) {}
	}
}
public class Test13 {
	public static void main(String[] args) throws Exception{
		System.out.println("hi");
		PrintThread p1=new PrintThread("first");
		PrintThread p2=new PrintThread("Second");
		PrintThread p3=new PrintThread("third");
		p1.start();
		p2.start();
		p3.start();
		Thread.sleep(20000);
		System.out.println("bye");
	}

}

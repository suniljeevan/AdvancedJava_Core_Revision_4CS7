//print 5 to 1 by three different threads concurrently
// not concurrent 5 4 3 2 1    5 4 3 2 1   5 4 3 2 1
//concurrent 5 5 5  4 4 4 3 3 3 2 2 2 1 1 1 
class PrinttThread extends Thread {
	String name;
	PrinttThread(String name) {
		this.name=name;
		System.out.println(name +" thread is created");
	}
public void run() {
	try {
	for(int i=5;i>=1;i--) {
		System.out.println(name +" "+i);
		Thread.sleep(3000);
	}
	}catch(Exception e) {}
}

}

public class Test14 {
	public static void main(String[] args) throws Exception {
		PrinttThread t1=new PrinttThread("first");
		PrinttThread t2=new PrinttThread("second");
		PrinttThread t3=new PrinttThread("third");
		t1.start();t2.start();t3.start();
		Thread.sleep(45000);
	}
}

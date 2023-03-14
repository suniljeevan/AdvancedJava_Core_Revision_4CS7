//printing 3 different numbers factorials by 3 threads concurrently
//N.B - Krishna 889 completed first,
class FactorialThread extends Thread {
	String name;
	int number;
	long fact=1;
	FactorialThread(String name,int number) {
		this.name=name;
		this.number=number;
		System.out.println(name+" thread created");
	}
	public void run() {
		try {
		for(int i=1;i<=number;i++) {			
			fact=fact*i;
			System.out.println(name+" thread is executing");
			Thread.sleep(3000);
		}			
		}catch(Exception e) {}
		System.out.println(name+" factorial is "+fact);
	}
}
public class Test15 {
	public static void main(String[] args)throws Exception {
		FactorialThread t1=new FactorialThread("first",5);
		FactorialThread t2=new FactorialThread("second",6);
		FactorialThread t3=new FactorialThread("third",7);
		t1.start();t2.start();t3.start();
		System.out.println("alive or dead");
		System.out.println("first alive "+t1.isAlive());
		System.out.println("second alive "+t2.isAlive());
		System.out.println("third alive "+t3.isAlive());
		t1.join();
		System.out.println("alive or dead");
		System.out.println("first alive "+t1.isAlive());
		System.out.println("second alive "+t2.isAlive());
		System.out.println("third alive "+t3.isAlive());
		t2.join();
		System.out.println("alive or dead");
		System.out.println("first alive "+t1.isAlive());
		System.out.println("second alive "+t2.isAlive());
		System.out.println("third alive "+t3.isAlive());
		t3.join();
		System.out.println("alive or dead");
		System.out.println("first alive "+t1.isAlive());
		System.out.println("second alive "+t2.isAlive());
		System.out.println("third alive "+t3.isAlive());
	}
}







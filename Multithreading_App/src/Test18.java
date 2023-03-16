import java.util.Random;
//producer and consumer
//inter thread communication wait() and notify()
//create a producer thread to generate many random number, one at a time
//consumer will take that number from producer to check number is 
//even or odd
class store {
	int number;
	boolean isgenerated=false;
	synchronized void check() {
		if(number%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
class producer extends Thread {
	store s;
	producer(store s) {
		this.s=s;
	}
	public void run() {
		while(true) {
		try {
			if(s.isgenerated==true) wait();
			Random r=new Random();
			int n=r.nextInt()%100;
			System.out.println("number generated "+n);
			s.number=n;
			s.isgenerated=true;
			notify();
		}catch(Exception e) {}
	}
}
}
class consumer extends Thread {
	store s;
	consumer(store s) {
		this.s=s;
	}
	public void run() {
		while(true) {
		try {
			if(s.isgenerated==false) wait();
			s.check();
			s.isgenerated=false;
			notify();
		}catch(Exception e) {}
	}
}
}
public class Test18 {
	public static void main(String[] args) throws Exception{
		store s=new store();
     producer p=new producer(s);
     consumer c=new consumer(s);
     p.start();c.start();
     p.join();c.join();
	}
}

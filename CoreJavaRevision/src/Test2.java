class SecondCircle {
	private int x,y;
	private double r;
	public SecondCircle(int x, int y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public SecondCircle() {
	}
	public void printArea() {
		System.out.println("Area is "+3.14*r*r);
	}
}
public class Test2 {
	public static void main(String[] args) {
           SecondCircle a=new SecondCircle(2,3,4.5);
           SecondCircle b=new SecondCircle(3,4,6.5); 
           a.printArea();
           b.printArea();

	}

}

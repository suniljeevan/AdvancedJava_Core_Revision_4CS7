class Circle {
	private int x,y;
	private double radious;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
   public void printArea() {
System.out.println("Area of circle :"+3.141*radious*radious);
   }
   public void printCenter() {
	   System.out.println("("+x+","+y+")");
   }
}
public class Test {
	public static void main(String[] args) {
		Circle acircle=new Circle();
		Circle bcircle=new Circle();
        acircle.setRadious(3.5);
        bcircle.setRadious(4.5);
        acircle.printArea();
        bcircle.printArea();
        acircle.setX(2);acircle.setY(3);
        bcircle.setX(9); bcircle.setY(8);
        acircle.printCenter();
        bcircle.printCenter();
	}

}

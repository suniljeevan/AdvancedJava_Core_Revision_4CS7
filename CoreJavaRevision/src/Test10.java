public class Test10 {
	public static void main(String[] args) {
		int x=5,y=0;
		System.out.println("Add "+(x+y));
		System.out.println("Subtract : "+(x-y));
		try {
		System.out.println("Div : "+(x/y));
		}catch(Exception e) {
			System.out.println("Divison by zero");
		}
		System.out.println("Mult "+(x*y));
	}

}

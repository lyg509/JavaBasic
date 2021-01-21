class DataTest{int x;}
public class TestParameterEx2 {
	
	public static void main(String[] args) {
		DataTest d = new DataTest();
		d.x = 10;
		System.out.println("Main() : x =" +d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" +d.x);
	}

	 static void change(DataTest d) {
		d.x = 1000;
		System.out.println("change() : x =" +d.x);
		
	}

}

class DataTest2{ int x;}
public class TestParameterEx3 {

	public static void main(String[] args) {
		DataTest2 d = new DataTest2();
		d.x = 10;
		
		DataTest2 d2 = copy(d);
		
		System.out.println("d.x = "+ d.x);
		System.out.println("d2.x =" +d2.x);
	}

	static DataTest2 copy(DataTest2 d) {
		DataTest2 tmp = new DataTest2();
		
		tmp.x = d.x;
		return tmp;
	}

}

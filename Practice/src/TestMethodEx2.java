class TestClass{
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMehtod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
		//instanceMethod();	    호출 불가
		staticMethod();		//호출 가능

	}
}

class TestClass2{
	int iv;
	static int cv;
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
		
	}
	
	static void staticMethod() {
	//	System.out.println(iv);	     인스턴스 변수 사용 x
		System.out.println(cv);  //클래스 변수는 사용가능
		
	}
}
public class TestMethodEx2 {

	public static void main(String[] args) {
	
	}

}

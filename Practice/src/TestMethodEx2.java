class TestClass{
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMehtod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
		//instanceMethod();	    ȣ�� �Ұ�
		staticMethod();		//ȣ�� ����

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
	//	System.out.println(iv);	     �ν��Ͻ� ���� ��� x
		System.out.println(cv);  //Ŭ���� ������ ��밡��
		
	}
}
public class TestMethodEx2 {

	public static void main(String[] args) {
	
	}

}

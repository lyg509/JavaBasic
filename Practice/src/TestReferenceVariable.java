
public class TestReferenceVariable {

	public static void main(String[] args) {
		CarEx1 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		
		fe.water();
		car = fe;		//car = (Car)fe;���� ����ȯ�� ����
	//  car.water        ������ ���� carŸ���� ���������δ� water()�� ȣ���� �� ����.
		fe2 = (FireEngine)car;	//�ڼ�Ÿ�� <-����Ÿ�� ����ȯ ���� �Ұ�
		fe2.water();

	}

}


class CarEx1{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends CarEx1{
	void water() {
		System.out.println("water!");
	}
}
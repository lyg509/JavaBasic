
public class TestReferenceVariable {

	public static void main(String[] args) {
		CarEx1 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		
		fe.water();
		car = fe;		//car = (Car)fe;에서 형병환이 생략
	//  car.water        컴파일 에러 car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;	//자손타입 <-조상타입 형변환 생략 불가
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
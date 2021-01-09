

public class Construct {

	public static void main(String[] args) {



		// TODO Auto-generated method stub

		//생성자의 이름은 클래스의 이름과 같아야 한다.
		//생성자는 리턴 값이 없다.
		//기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		
		Car c1 = new Car("black", "manual",4);
		
		
		System.out.println("c의 color=" +c.color +", gearType= "+c.gearType+ ", door= "+ c.door);
		System.out.println("c1의 color=" +c1.color +", gearType= "+c1.gearType+ ", door= "+ c1.door);
		
		

	}
}
class Point{
	Point(){
		//매개변수가 없는 생성자.
	}

	Point(int x, int y){
		//매개변수가 있는 생성자

	}


	
}

class Car{
	String color; 	//색상
	String gearType; //변속기 종류 auto(자동) , manual(수동)
	int door;

	Car(){} //기본 생성자
	Car(String c, String g,int d){
		color = c;
		gearType = g;
		door = d;

	}
}

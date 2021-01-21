class Data_1{
	int value;
}

class Data_2{
	int value;
	
	Data_2(int x){	//매개변수가 있는 생성자
		value = x;
	}

	public Data_2() {
		// TODO Auto-generated constructor stub
	}
}



class TestCar{
	String color;	
	String gearType;	
	int door;
	
	TestCar(){};
	TestCar(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
	
}

class TestCar2{
	String color;
	String gearType;
	int door;
	
	
	TestCar2(){
		this("white","auto",4);
		
	}
	
	TestCar2(String color){
		this(color, "auto",4);
		
	}
	
	TestCar2(String color, String gearType, int door){
	this.color = color;
	this.gearType = gearType;
	this.door = door;

	
		
	
}

}


public class TestConstructor {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
		
		
		TestCar c1 = new TestCar();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		TestCar c2 = new TestCar("black","manual",5);
		
	
	
		
		System.out.println("c1의 clor = "+ c1.color+", c1의 clor = "+ c1.gearType+", c1의 door = "+c1.door);
		System.out.println("c2의 clor = "+ c2.color+", c2의 clor = "+ c2.gearType+", c2의 door = "+c2.door);
		
	
		TestCar2 c3 =  new TestCar2();
		TestCar2 c4 =  new TestCar2("blue");
		
		System.out.println("c3의 clor = "+ c3.color+", c3의 clor = "+ c3.gearType+", c3의 door = "+c3.door);
		
		System.out.println("c4의 clor = "+ c4.color+", c4의 clor = "+ c4.gearType+", c4의 door = "+c4.door);
		
		
		
	}

}

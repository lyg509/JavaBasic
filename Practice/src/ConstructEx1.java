class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "auto", 4);
		
	}
	
	Car2(String color){
		this(color,"auto", 4);
		
	}
	


	public Car2(String color, String gearType, int door) {
		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
    class InitTest{
    	//변수의 초기화
    	int x;	//인스턴스 변수
    	int y= x;
    	
    	void method1() {
    	int i;	//지역변수
    	//int j = i; //지역변수를 초기화하지 않고사용
    	
    	//멤버변수와 배열의 초기화는 선택이지만, 지역변수의 초기화는 필수이다.
    	}
    	
    }
    
    class Membervariable{
    	static int[] arr = new int[10];
    	
    	static {
    		for(int i =0; i<arr.length; i++) {
    			arr[i] = (int)(Math.random()*10)+1;
    			
    		}
    		
    		
    	}
    }

public class ConstructEx1 {

	public static void main(String[] args) {
		Car2  c1 = new Car2();
		Car2  c2= new Car2("blue");
		
	System.out.println("c1의 color " +c1.color+ ", gearType="
				+c1.gearType + ", door= "+c1.door);
		
		System.out.println("c2의 color " +c2.color+ ", gearType="
				+c2.gearType + ", door= "+c2.door);
		
		
	//	for(int i =0; i< arr.length; i++) {
		//	System.out.println("arr["+ i +"]:" + arr[i]);
		}

	}



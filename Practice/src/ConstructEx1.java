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
    	//������ �ʱ�ȭ
    	int x;	//�ν��Ͻ� ����
    	int y= x;
    	
    	void method1() {
    	int i;	//��������
    	//int j = i; //���������� �ʱ�ȭ���� �ʰ���
    	
    	//��������� �迭�� �ʱ�ȭ�� ����������, ���������� �ʱ�ȭ�� �ʼ��̴�.
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
		
	System.out.println("c1�� color " +c1.color+ ", gearType="
				+c1.gearType + ", door= "+c1.door);
		
		System.out.println("c2�� color " +c2.color+ ", gearType="
				+c2.gearType + ", door= "+c2.door);
		
		
	//	for(int i =0; i< arr.length; i++) {
		//	System.out.println("arr["+ i +"]:" + arr[i]);
		}

	}



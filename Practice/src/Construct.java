

public class Construct {

	public static void main(String[] args) {



		// TODO Auto-generated method stub

		//�������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�.
		//�����ڴ� ���� ���� ����.
		//�⺻ �����ڰ� �����Ϸ��� ���ؼ� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�.
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		
		Car c1 = new Car("black", "manual",4);
		
		
		System.out.println("c�� color=" +c.color +", gearType= "+c.gearType+ ", door= "+ c.door);
		System.out.println("c1�� color=" +c1.color +", gearType= "+c1.gearType+ ", door= "+ c1.door);
		
		

	}
}
class Point{
	Point(){
		//�Ű������� ���� ������.
	}

	Point(int x, int y){
		//�Ű������� �ִ� ������

	}


	
}

class Car{
	String color; 	//����
	String gearType; //���ӱ� ���� auto(�ڵ�) , manual(����)
	int door;

	Car(){} //�⺻ ������
	Car(String c, String g,int d){
		color = c;
		gearType = g;
		door = d;

	}
}

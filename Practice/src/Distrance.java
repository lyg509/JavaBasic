
public class Distrance {
	static double getDistance(int x, int y, int x1,int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y�� ��������
		
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));
		
		PlayingCard card = new PlayingCard(1,1);
	}

	
}

class PlayingCard{
	int kind; //�ν��Ͻ� ����
	int num;
	
	static int width;	//Ŭ���� ����
	static int height;
	
	PlayingCard(int k, int n){ //��������
		kind = k; 
		num = n;
		
	}
	
	
	
	
}
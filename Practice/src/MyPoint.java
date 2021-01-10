
public class MyPoint {
	
	int x;
	int y;
	
	MyPoint(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	double getDistance(int x, int y){
	
		
		
			return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)); // x, y는 지역변수
	}

	public static void main(String[] args) {
		
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
		
		// TODO Auto-generated method stub

	}

}

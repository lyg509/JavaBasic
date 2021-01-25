
public class TestSuperEx2 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println("x=" + p.x+ " ,y=" +p.y+ " ,z=" +p.z);

	}

}

class PointTest{
	int x,y;
	
	PointTest(int x, int y){
		this.x = x;
		this.y = y;
		
	}
}

class Point3D extends PointTest{
	int z;
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
}

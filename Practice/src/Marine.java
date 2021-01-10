
public class Marine {
	int x = 0, y=0; // 마린의 위치 좌표
	int hp = 60;
	int weapon = 6;
	int armor = 0;
	
	void weaponUp() {
		weapon++;
		
	}
	
	void armorUp() {
		armor++;
	}
	
	void movie(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.Scanner;

public class ExIF {

	public static void main(String[] args) {
		
		int score = 0;
		char grade =' ';
		
		System.out.println("������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >=80){
			grade = 'B';
			
		}
		else if(score >=80){
			
			grade = 'C';
		}
		else {
			grade = 'D';
	}
		System.out.println("����� ������"+grade+"�Դϴ�");
	}
}



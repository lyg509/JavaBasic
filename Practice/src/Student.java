public class Student {

	
	public static void main(String[] args) {
		Student1 s = new Student1("ȫ�浿",1,1,100,60,76);
		
		s.name = "����";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� :" + s.name);
		System.out.println("���� :" + s.getTotal());
		System.out.println("��� :" + s.getAverage());
		
		
	}
	
	
	

}
class Student1{
	String name ;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	 Student1(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info(){
		return  name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+(kor+eng+math)
				+","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)
				;
				}
	
	public int getTotal() {
		int result=0;
		result += kor+eng+math;
		
		return result;
	}

	
	public int getAverage() {
		int average=0;
		average += ((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f) ;
		
		return average;
	}
	
	}
	






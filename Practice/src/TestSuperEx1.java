
public class TestSuperEx1 {

	public static void main(String[] args) {
	Child c = new Child();
	c.method();
	
	Child2 c2 = new Child2();
	c2.method();
	}

}

class Parent {int x = 10;} // super.x}

class Child extends Parent {
	int x = 20; 	//this.x
	
	void method() {
		System.out.println("x="+ x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
		
	}
}


class Parent2 {int x = 10;}	//super.x와 this.x 둘 다 가능

class Child2 extends Parent2{
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
		
	}
}
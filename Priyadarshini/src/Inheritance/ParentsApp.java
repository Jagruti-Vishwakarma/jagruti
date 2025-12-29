package Inheritance;  // imp

public class ParentsApp {

	public static void main(String[] args) {
		Childs1 c= new Childs1(100,99);
        System.out.println(c.a+" "+c.b);
	}

}
class Parents {
	int a;
	int b;
	public Parents() {
		this(100,99);
		a=20;
		b=20;
		System.out.println("zero parameterize parent");
	}
	public Parents(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("2 parameterize parent");
	}
}
class Childs1 extends Parents{
	public Childs1() {
		a=30;
		b=40;
		System.out.println("zero parameterize child");
	}
	public Childs1(int a, int b) {
		this();
		this.a=a;
		this.b=b;
		System.out.println("2 parameterize child");

	}

}

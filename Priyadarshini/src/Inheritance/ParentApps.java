package Inheritance;

public class ParentApps {

	public static void main(String[] args) {
		Child c= new Child();
        System.out.println(c.a+" "+c.b);
	}

}
class Parent {
	int a;
	int b;
	pubilc Parent() {
		a=20;
		b=20;
	}
	public Parent(int a, int b) {
		this.a=a;
		this.b=b;
	}
}
class Child extends Parent{
	public Child() {
		a=30;
		
		b=40;
	}
	public Child(int a, int b) {
		this.a=a;
		this.b=b;
	}
}
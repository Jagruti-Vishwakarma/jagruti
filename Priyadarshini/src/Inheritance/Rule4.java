//Rule4. Multiple inheritance is not allowed in java this is because ambiguity issues might arise and the diamond shape problem is also exist.

package Inheritance;

public class Rule4 {

	public static void main(String[] args) {
		Child2 c = new Child2();

	}
}
class Parent1{
	int a=10;
	public Parent1() {
		System.out.println("This is parent constructor");
	}
}
class Parent2{
	int b=20;
	public Parent2() {
		System.out.println("This is parent constructor");
	}
}
class Child2 extends Parent1, Parent2 {   // syntax error
	public Child2() {
		System.out.println("This is child constructor");
	}
}


//Rule3. The constructor of a class also do not participate in inheritance however the parent class constructor is called because of constructor chaining.

package Inheritance;

public class Rule3 {

	public static void main(String[] args) {
		Child3 c = new Child3();

	}

}
class Parent3{
	public Parent3() {
		System.out.println("This is parent constructor");
	}
}
class Child3 extends Parent3 {
	public Child3() {
		System.out.println("This is child constructor");
	}
}

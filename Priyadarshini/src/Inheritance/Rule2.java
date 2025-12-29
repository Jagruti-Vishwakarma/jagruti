// Rule2. The private members of a class does not participate in inheritance.

package Inheritance;

public class Rule2 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		System.out.println("-------");
		c.disp();

	}

}
class Rule2{
	private int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		
	}
}
class Child extends Rule2{
	
}
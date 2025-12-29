//RUle5. Although multiple inheritance is not allowed in java multi-level inheritance is allowed.

package Inheritance;

public class Rule5 {
	public static void main(String[] args) {
		Child1 c = new Child1();
        System.out.println(c.a);
        System.out.println(c.b);
	}
}
class GrandParents{
	int a=10;
}
class Parentss extends GrandParents{
	int b=20;
}
class Child1 extends Parentss{
}


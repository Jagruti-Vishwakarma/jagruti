//Rule6. Cyclic inheritance is not permitted in java.

package Inheritance;

public class Rule6 {
	public static void main(String[] args) {
		Childs c = new Childs();
	}
}
class Parent0 extends Childs {   //cyclic inheritance - it throws a compile time error
}
class Childs extends Parent0{

}


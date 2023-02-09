
class Parent
{
	String name="Vihaan";
	int age=12;
	
	void disp()
	{
		System.out.println("Paren1 :"+name +" "+age);
	}
}

class Child extends Parent
{
	
}
class Child2 extends Parent
{
	
}
class Child3 extends Parent
{
	
}
public class HierarchiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ch1=new Child();
		Child2 ch2 =new Child2();
		Child3 ch3=new Child3();
		ch1.disp();
		ch2.disp();
		ch2.disp();
	}

}

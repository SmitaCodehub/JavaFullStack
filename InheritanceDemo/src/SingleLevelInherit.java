


class Parent1
{
	String name="Vihaan";
	int age=12;
	
	void disp()
	{
		System.out.println("Paren1 :"+name +" "+age);
	}
}

class Child1 extends Parent1
{
	
}
public class SingleLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 ch=new Child1();
		ch.disp();
	}

}

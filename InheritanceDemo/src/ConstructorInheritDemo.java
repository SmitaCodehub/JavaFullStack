

class Parent2
{
	int a;
	int b;
	
	Parent2()
	{
		a=10;
		b=20;
		System.out.println("Parent Consructor without parameters");
	}
	
	Parent2(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent Consructor with parameters");
	}
}

class Childd extends Parent2
{
	
	 int x,y;
	
	 Childd()
	{
		this(100,200);
		x=1000;
		y=2000;
		System.out.println("Child Consructor without parameters");
	}
	 
	 Childd(int x,int y)
	 {
		this.x=x;
		this.y=y;
		System.out.println("Child Consructor with parameters");
	 }
	 void disp()
	 {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(y);
	 }
}
public class ConstructorInheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Childd ch=new Childd();
		  ch.disp();
		 Childd ch1 =new Childd(1111,2222);
		 ch1.disp();
	}

}

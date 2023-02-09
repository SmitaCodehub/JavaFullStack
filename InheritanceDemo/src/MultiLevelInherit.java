
class Par //extends Object
{
	//object properties and methds
	String name="Vihaan";
	int age=12;
	
	void disp()
	{
		System.out.println("Parent Class "+ age + name);
	}
}
class Chil1 extends Par
{
	
}
class Chil2 extends Chil1
{
	
}
public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chil2 ch =new Chil2();
		
		ch.disp();
				

	}

}


class Student{
	private String name;
	private int age;
	private  String city;
	
	public void setData(String name, int age, String city )
	{
		this.name=name;
		this.age=age;
		this.city=city;		
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
}

public class EncapTest {

	public static void main(String[] args) {
		
		Student st=new Student();
		st.setData("vihaan", 12,"perth");
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getCity());
		
	}

}

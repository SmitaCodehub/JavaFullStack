
class Student2{
	private String name;
	private int age;
	private  String city;
	
	public  Student2(String name, int age, String city )
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



public class EncapConstructorOverloading {

	public static void main(String[] args) {
		Student2 st=new Student2("vihaan", 12,"perth");
		
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getCity());
	}

}

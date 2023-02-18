// Encapasulation with getter and Setter methods


class Student1{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private int age;
	private  String city;
	
}
	
public class EncapDemo {

	public static void main(String[] args) {
		Student1 st=new Student1();
		
		st.setAge(18);
		
		System.out.println(st.getAge());
		
		st.setName("vihaan");
		System.out.println(st.getName());
		
		st.setCity("Perth");
		System.out.println(st.getCity());
	}

}

package jdbc;

public class userAgeVO {
	private String name;
	private String phone;
	private int birth;
	private int age;
	
	public userAgeVO(){}
	
	public userAgeVO(String name, String phone, int birth, int age) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"\t"+phone+"\t"+birth+"\t"+age;
	}
	
	
}

package jdbc;

import java.util.Calendar;

public class userVO {
	private String name;
	private String phone;
	private int birth;
	
	public userVO(){}
	public userVO(String name, String phone, int birth) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
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

	@Override
	public String toString() {
		return name+"\t"+phone+"\t"+birth+"\t"+getAge();
	}

	private int getAge() {
		return (Calendar.getInstance().get(Calendar.YEAR) - getBirth())+1;
		
		
	}

}

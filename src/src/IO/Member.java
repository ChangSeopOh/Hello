package IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Member implements Externalizable{
	private String name = null;
	private String id = null;
	private int age = 0;
	private String phone = null;
	private String pwd = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Member() {
	}

	public Member(String name, String id, int age, String phone, String pwd) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return name + "\t" + id + "\t" + age + "\t" + phone + "\t" + pwd;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(id);
		out.writeObject(age);
		out.writeObject(phone);
		out.writeObject(pwd);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		id = (String) in.readObject();
		age = (Integer) in.readObject();
		phone = (String) in.readObject();
		pwd = (String) in.readObject();
		
	}
}

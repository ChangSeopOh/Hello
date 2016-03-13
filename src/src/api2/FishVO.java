package api2;

public class FishVO {
	private String name;
	private int year;
	private String address;
	private String phone;

	public FishVO(String name, int year, String address, String phone) {
		super();
		this.name = name;
		this.year = year;
		this.address = address;
		this.phone = phone;
	}

	public FishVO(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "FishVO [name=" + name + ", year=" + year + ", address=" + address + ", phone=" + phone + "]";
	}

}

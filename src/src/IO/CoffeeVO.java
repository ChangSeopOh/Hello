package IO;

public class CoffeeVO {
	private String name = null;
	private int count;
	private int total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}



	public CoffeeVO() {
	}

	public CoffeeVO(String name, int count, int total) {
		this.name = name;
		this.count = count;
		this.total = total;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}

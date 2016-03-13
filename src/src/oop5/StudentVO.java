package oop5;

public class StudentVO {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int pil;

	public StudentVO() {
	}

	public StudentVO(String name, int kor, int eng, int mat, int pil) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.pil = pil;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getPil() {
		return pil;
	}

	public void setPil(int pil) {
		this.pil = pil;
	}

	@Override
	public String toString() {
		// return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng +
		// ", mat=" + mat + ", pil=" + pil + "]";
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + pil + "\t" + getTotal() + "\t" + getAvg();
	}

	private double getAvg() {

		return getTotal() / 4;
	}

	private int getTotal() {

		return getKor() + getEng() + getMat() + getPil();
	}

}

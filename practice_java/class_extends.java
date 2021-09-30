class Person{
	int iAge;
	public String strName;
	protected int iHeight;
	private int iWeight;
	public void setWeight(int iWeight) {
		this.iWeight = iWeight;
	}
	public int getWeight() {
		return iWeight;	
	}
}

public class class_extends extends Person{
	void set() {
		iAge = 30;
		strName = "홍길동";
		iHeight = 175;
		setWeight(99);
		System.out.println("나이: "+ iAge);
		System.out.println("이름: "+ strName);
		System.out.println("키: "+ iHeight);
	}
	public static void main(String[] args) {
		class_extends s = new class_extends();
		s.set();
	}
}

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
		strName = "ȫ�浿";
		iHeight = 175;
		setWeight(99);
		System.out.println("����: "+ iAge);
		System.out.println("�̸�: "+ strName);
		System.out.println("Ű: "+ iHeight);
	}
	public static void main(String[] args) {
		class_extends s = new class_extends();
		s.set();
	}
}

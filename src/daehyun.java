// 클래스 상속

class Point{
	int x,y;
	void set(int x,int y) {
		this.x = x ; this.y =y;
	}
	void showPoint(){
		System.out.println("("+x+","+y+")");
	}
}


public class daehyun extends Point{

	String strColor;
	
	void setColor(String strColor) {
		this.strColor = strColor;
	}
	
	void showColorPoint() {
		System.out.print(strColor);
		showPoint();
	}
	public static void main(String[] args) {
		daehyun cp = new daehyun();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
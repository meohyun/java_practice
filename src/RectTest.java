class Rectangle{
	
	int x1,y1,x2,y2;
	public int width = Math.abs(x1-x2);
	public int height = Math.abs(y1-y2);
	public int area = height * width;
	
	Rectangle(){
		
	}
	
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	void set(int x1,int y1,int x2,int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	boolean check() {
		if (Math.abs(y1-y2) != Math.abs(x1-x2)) 
			return true;
		else
			return false;
	}
	
	int square() {
		if (Math.abs(y1-y2) != Math.abs(x1-x2))
			return Math.abs(y1-y2)*Math.abs(x1-x2) ;
		else
			return 0;
	}
	void show() {
		if (Math.abs(y1-y2) != Math.abs(x1-x2)) {
			System.out.println("("+x1+","+y1+")");
			System.out.println("("+x1+","+y2+")");
			System.out.println("("+x2+","+y1+")");
			System.out.println("("+x2+","+y2+")");
			System.out.println("넓이: "+ Math.abs(y1-y2)*Math.abs(x1-x2));
	
	}
		else
			System.out.println("출력불가");
			
			
	}
	
	boolean equals(Rectangle r) {
		if (this.area != r.area) 
			return false;
		else if (this.width != r.width)
			return false;
		else if (this.height != r.height)
			return false;
		else
			return true;
			
		
	}
		
}

public class RectTest extends Rectangle{
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}
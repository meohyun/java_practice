class Rectangle{
	
	int x1,y1,x2,y2;
	int width = Math.abs(x1-x2);
	int height = Math.abs(y1-y2);
	int area = height * width;
	
	Rectangle(){
	
	}
	
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	// width, height ,area 필드 정의
	void set2(int x1, int y1, int x2, int y2) {
		this.width = Math.abs(x1-x2);
		this.height = Math.abs(y1-y2);
		this.area = height * width;
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
		if (check())
			return Math.abs(y1-y2)*Math.abs(x1-x2) ;
		else
			return 0;
	}
	void show() {
		
		if (check()) {
			System.out.print("("+x1+","+y1+")"+" ");
			System.out.print("("+x1+","+y2+")"+" ");
			System.out.print("("+x2+","+y1+")"+" ");
			System.out.print("("+x2+","+y2+")"+" ");
			System.out.println("넓이: "+ Math.abs(y1-y2)*Math.abs(x1-x2));
	
	}
		else
			System.out.println("출력불가");
			
			
	}
	
	boolean equals(Rectangle r) {

		if (this.area == r.area && this.width == r.width && this.height == r.height ) 
			return true;
		
		else
			return false;
			
		
	}
		
}

public class RectTest extends Rectangle{
	
	
	public static void main(String args[]) {
		
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		s.set2(1 ,1, 2, 3);
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.set2(-2, 2, -1, 4);
		
		
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}

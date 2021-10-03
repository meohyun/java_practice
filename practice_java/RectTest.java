class Rectangle{
	
	int x1,y1,x2,y2;
	int width; // 가로길이는 음수면 안되므로 절댓값
	int height; // 세로길이도 음수면 안되므로 절댓값
	int area;
	
	// 매개변수가 없는 생성자
	Rectangle(){
	
	}
	
	// 매개변수가 있는 생성자
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	// 좌표 설정
	void set(int x1,int y1,int x2,int y2) {
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
	

	
	boolean check() {
		// 가로 세로 길이가 다르면 직사각형
		if (height != width) 
			return true;
		// 같으면 정사각형 
		else
			return false;
	}
	
	// 직사각형이면 넓이 리턴
	int square() {
		if (check())
			return area ;
		// 정사각형이면 0 리턴
		else
			return 0;
	}
	
	// 직사각형이면 직사각형의 네 점의 좌표,넓이 출력
	void show() {
		
		if (check()) {
			System.out.print("("+x1+","+y1+")"+" ");
			System.out.print("("+x1+","+y2+")"+" ");
			System.out.print("("+x2+","+y1+")"+" ");
			System.out.print("("+x2+","+y2+")"+" ");
			System.out.println("넓이: "+ area);
	
	}	// 정사각형이면 출력 불가
		else
			System.out.println("출력불가");
			
			
	}
	
	boolean equals(Rectangle r) {
		// 넓이,가로길이, 세로길이 다 같다면 모양과 크기가 동일 -> true
		if (this.area == r.area && this.width == r.width && this.height == r.height ) 
			return true;
		// 넓이가 같고 회전시켰을때 모양과 크기가 동일 -> true
		else if (this.area == r.area && this.width == r.height && this.height == r.width)
			return true;
		// 위 조건 중 셋중 한개라도 만족하지 못한다면 -> false
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
		r.set(-2, 2, -1, 4);
		r.set2(-2, 2, -1, 4);
		
		
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
		else
			System.out.println("두 사각형은 다릅니다.");
	}
}

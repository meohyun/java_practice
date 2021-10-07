
public class EmployeeTest {
	Employee e1,e2,e3;
	Manager m1,m2,m3;
	public EmployeeTest() {
		e1 = new Employee("아이유",30000000,"kd039482");
		e2 = new Employee("에일리",35000000,"ek827593");
		e3 = new Employee();
		m1 = new Manager("김건모",70000000,"lg837593","인사부");
		m2 = new Manager("서태지",60000000,"je934827","관리부");
		m3 = new Manager();
	}
	public void showinfo() {
		String info = "이름\t월급\t\t사번\t\t관리부서\n";
		info += "===============================================\n";
		info += e1 + "\n" + e2 + "\n" + e3 + "\n" + m1 + "\n" + m2 + "\n" +m3;
		System.out.println(info);
	}
	public static void main(String args[]) {
		EmployeeTest myTest = new EmployeeTest();
		myTest.showinfo();
		System.exit(0);
	}
}

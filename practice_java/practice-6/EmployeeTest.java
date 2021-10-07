
public class EmployeeTest {
	Employee e1,e2,e3;
	public EmployeeTest() {
		e1 = new Employee("아이유",30000000,"kd039482");
		e2 = new Employee("에일리",35000000,"ek827593");
		e3 = new Employee();
	}
	public void showinfo() {
		String info = "이름\t월급\t사번\t\t관리부서\n";
		info += "===============================================\n";
		info += e1 + "\n" + e2 + "\n" + e3 + "\n";
		System.out.println(info);
	}
	public static void main(String args[]) {
		EmployeeTest myTest = new EmployeeTest();
		myTest.showinfo();
		System.exit(0);
	}
}

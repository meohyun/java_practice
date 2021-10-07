public class Manager extends Employee{
	private String department;

	
	Manager(){
		this.department = "";
	}
	
	
	Manager(String name, int salary, String ID, String department){
		this.name =name;
		this.salary = salary;
		this.ID = ID;
		this.department = department;
	}
	
	void set_Manager(String name, int salary, String ID, String department){
		this.name = name;
		this.salary = salary;
		this.ID = ID;
		this.department = department;
	}
	
	public String toString() {
		String to_str = name + "\t" + Integer.toString(salary) + "\t" + ID + "\t" + department;
		return to_str;
	}
	
}
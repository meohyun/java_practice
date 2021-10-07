public class Employee{
	protected String name;
	private int salary;
	protected String ID;
	
	Employee(){
		this.name = "";
		this.salary = 0;
		this.ID = "";
	}
	
	Employee(String name, int salary, String ID){
		this.name = name;
		this.salary = salary;
		this.ID = ID;	
	}
	
	public void set(String name, int salary, String ID) {
		this.name = name;
		this.salary = salary;
		this.ID = ID;
	}
	
	public int get() {
		return salary;
	}

	public String toString() {
		String to_str = name +"\t" +Integer.toString(salary) +"\t" + ID;
		return to_str;
	}
}
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
	
	void set(String name, int salary, String ID) {
		this.name = name;
		this.salary = salary;
		this.ID = ID;
	}
	 
	public String getName() {
		String str_name = "\t"+ name;
		return str_name;
	}
	
	public String get() {
		String str_salary ="\t"+Integer.toString(salary);
		return str_salary ;
	
	}
	public String getID() {
		String str_ID = "\t" + ID;
		return str_ID;
	}
	
}
package br.com.exercises.orientedObjects.employee;

public class Employee {

	private int id;

	private String firstName;

	private String lastName;

	private double salary;
	
	public Employee(int id, String firstName, String lastName, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public double getAnnualSalary() {
		return this.salary * 12;
	}
	
	public double raiseSalary(double percent) {
		return this.salary + (this.salary * (percent / 100));		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");

		return builder.toString();
	}
}
package br.com.exercises.orientedObjects.employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Karla", "Macedo", 1200);
		
		System.out.println(employee.toString() + "\n");
		
		System.out.println("*************** Employee Data ***************");
		System.out.println("ID: " + employee.getId());
		System.out.println("Name Employee: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());		
		System.out.println("Annual Salary: " + employee.getAnnualSalary());
		System.out.println("Raise Salary: " + employee.raiseSalary(10));
	}
}
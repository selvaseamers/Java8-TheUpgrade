package ex.j8.lambda.on.demand.ex;

public class Employee {

	String firstName;

	String lastName;

	int age;

	int salary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int age, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee => [ First Name : " + this.firstName + ", Last Name : " + this.lastName + ", Age : " + this.age
				+ ", Salary : " + this.salary + " ]\n";
	}

}

package ex.j8.lambda.on.demand.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOnDemandMain {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee("selva", "kumar", 21, 10000),
											   new Employee("bala", "mani", 26, 15000),
											   new Employee("vijay", "srini", 28, 12000),
											   new Employee("karthik", "reddy", 40, 20000),
											   new Employee("rama", "devi", 29, 30000));

		Comparator<Employee> sortByFName = (object1, object2) -> {
			return object1.firstName.compareTo(object2.firstName);
		};

		Comparator<Employee> sortByLNameFLetter = (object1, object2) -> {
			String letter1 = String.valueOf(object1.lastName.charAt(0));
			String letter2 = String.valueOf(object2.lastName.charAt(0));
			return letter1.compareTo(letter2);
		};

		Comparator<Employee> sortByLNameLLetter = (object1, object2) -> {
			String letter1 = String.valueOf(object1.lastName.charAt(object1.lastName.length() - 1));
			String letter2 = String.valueOf(object2.lastName.charAt(object2.lastName.length() - 1));
			return letter1.compareTo(letter2);
		};

		Comparator<Employee> sortByAge = (object1, object2) -> {
			return object1.age - object2.age;
		};

		Comparator<Employee> sortBySalary = (object1, object2) -> {
			return object1.salary - object2.salary;
		};

		Collections.sort(empList, sortByFName);
		System.out.println("Sort by first name : " + empList);

		Collections.sort(empList, sortByLNameFLetter);
		System.out.println("Sort by last name first letter : " + empList);

		Collections.sort(empList, sortByLNameLLetter);
		System.out.println("Sort by last name last letter : " + empList);

		Collections.sort(empList, sortByAge);
		System.out.println("Sort by age  : " + empList);

		Collections.sort(empList, sortBySalary);
		System.out.println("Sort by salary : " + empList);

	}

}

package sef.ATestTask.FirstActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstActivity extends Employee  {

	public static void main(String[] args) {

		ArrayList<Employee> employee = new ArrayList<>();

		employee.add(new Employee(1, "driver", "Romashka", 1000.0));
		employee.add(new Employee(2, "manager", "Vasilec", 2000.0));
		employee.add(new Employee(3, "director", "Oduvanchik", 3000.0));
		employee.add(new Employee(4, "developer", "Carrot", 4000.0));
		employee.add(new Employee(5, "tester", "Cucumber", 5000.0));
		employee.add(new Employee(6, "teacher", "Potato", 6000.0));


		for (int i =0; i<employee.size();i++) {
	Employee r = employee.get(i);
	System.out.println("Employee list: " + "ID" + r.getEmpId() + "Job Title " + r.getJobTitle() + "Company  " + r.getJobTitle() + "Salary" + r.getSalary();
}
}
		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		//Collections.sort(employee);
		//System.out.println(employee.announce() + ", salary is " + employee.getSalary());

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result


		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	
	


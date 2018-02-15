package ex1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSimple implements EmployeeService {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Employee getInfo(String id) {
		Employee ret = null;
		System.out.println(id);
		System.out.println("Arraylist size: "+employees.size());
		for (Employee employee : employees) {
			System.out.println(employee.getId());
			if (employee.getId().equals(id)) {
				ret = employee;
			}
		}
		return ret;
	}
	

	@Override
	public void addEmployee(String name, String id, String plan) {
		Employee temp = new Employee();
		temp.setId(id);
		temp.setName(name);
		temp.setHealthPlan(plan);
		employees.add(temp);
	}

}

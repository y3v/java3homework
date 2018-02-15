package ex1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class EmployeeInfo {
	private String name;
	private String empID;
	private String healthPlan;
	private Employee employee;
	private static EmployeeService empService = new EmployeeSimple();
	
	public String showResults() {
		String ret;
		if (name.isEmpty() || empID.isEmpty() || healthPlan.isEmpty()) {
			ret = "empError";
		}
		else {
			empService.addEmployee(name, empID, healthPlan);
			employee = empService.getInfo(empID);
			ret = "results";
		}
		return ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(String healthPlan) {
		this.healthPlan = healthPlan;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}

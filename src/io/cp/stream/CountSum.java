package io.cp.stream;

import java.util.List;

import io.cp.data.Employee;

public class CountSum {
	private List<Employee> emps = Employee.getEmployees();
	// find the sum of all the salary employees getting

	// 1st way
	public double getSalSumFirstWay() {
		return emps.stream().mapToDouble(e -> e.getSal()).sum();
	}
	// 2nd way
	public double getSalSumSecondWay() {
		return emps.stream().mapToDouble(e -> e.getSal()).reduce(0, (x, y) -> x + y);
	}
	// 3rd Way
	public double getSalSumThirdWay() {
		return emps.stream().mapToDouble(e -> e.getSal()).reduce(0, Double::sum);
	}
	
}

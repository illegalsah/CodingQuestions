package io.cp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.cp.data.Employee;

public class SetToGroupBy {
	
	private List<Employee> emps = Employee.getEmployees();
	
	public void setToGroupBy() {
		Map<Integer, List<Employee>> collect = emps.stream().collect(Collectors.groupingBy(Employee::getDeptNo));
		System.out.println(collect);
	}
	//Print the names of all jobs in the organization
	public void printTheNameOfAllJobs() {
		List<String> list = emps.stream().map(Employee::getJob).distinct().toList();
		System.out.println(list);
	}
}

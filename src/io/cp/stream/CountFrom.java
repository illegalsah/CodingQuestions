package io.cp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.cp.data.Employee;

public class CountFrom {
	private List<Employee> emps = Employee.getEmployees();
	
	// Find the count of each job of  employees present in the organization.
	
	public void countFromEachJob() {
		Map<String, Long> collect = emps.stream().collect(Collectors.groupingBy(Employee::getJob,
				Collectors.counting()
				));
		System.out.println(collect);
	}
	
	// find the depart which has highest number of emps
	
	public void findHighestNoEmpEachDept() {
	Map<Integer, Long> collect = emps.stream()
			.collect(Collectors.groupingBy(Employee::getDeptNo,Collectors.counting()));
		System.out.println(collect);
	}
}

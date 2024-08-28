package io.cp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.cp.data.Employee;

public class FindAverageSal {
	private List<Employee> emps = Employee.getEmployees();
	
	public void findTheAvgSal() {
		double orElse = emps.stream()
			.mapToDouble(Employee::getSal)
			.average()
			.orElse(0.0);
		System.out.println(orElse);
	}
	
	public void getAverageSalOfEachDept() {
		Map<Integer, Double> collect = emps.stream().collect(Collectors.groupingBy(Employee::getDeptNo,
				Collectors.averagingDouble(Employee::getSal)
				));
		System.out.println(collect);
	}
	
	public void findTheAvgSalBySpecificJob(String job) {
		double avgSal = emps.stream()
		.filter(x -> x.getJob().equals(job))
		.mapToDouble(Employee::getSal)
		.average()
		.orElse(0.0);
		System.out.println(avgSal);
	}
	
	
}

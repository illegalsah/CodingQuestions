package io.cp.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.cp.data.Employee;

public class MaxMin {
	private List<Employee> emps = Employee.getEmployees();
	
	// Find maximum salary from Employees
	public void findMaxSal() {
		double orElse = emps.stream()
		.mapToDouble(Employee::getSal)
		.max()
		.orElse(0.0);
		System.out.println(orElse);
	}
	
	// Find maximum salary getting Employee details
	
	public void findMaxSalEmp() {
		Optional<Employee> max = emps.stream()
									 .max(Comparator.comparing(Employee::getSal));
		
		if(max.isPresent()) {
			System.out.println(max.get());
		}else {
			System.out.println("Threa are no data");
		}
	}
	
	// find the max sal of all deptno
	
	public void findMaxSalOfAllDept() {
		Map<Integer, Double> collect = emps.stream()
		.collect(Collectors.groupingBy(Employee::getDeptNo,
				Collectors.collectingAndThen(Collectors
						.maxBy(Comparator.comparing(Employee::getSal))
						, emp->emp.get().getSal())));
		System.out.println(collect);
	}
	
	// same way we can get minimum data as well like
	
	// Which Manager has lowest salary
	
	public void lowestSalOfJob(String job) {
		 String empName = emps.stream()
		.filter(x ->x.getJob().equals(job)).min(Comparator.comparingDouble(Employee::getSal)).get().getEmpName();
		
		System.out.println(empName);
	}
}

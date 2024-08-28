package io.cp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.cp.data.Employee;

public class FilterGreaterOrLess {
	private List<Employee> emps = Employee.getEmployees();
	
	// Print employee details whose deptno is greater than 20.
	public void findEmpsGreaterThenDeptNo(int deptno) {
		List<Employee> list = emps.stream().filter(x -> x.getDeptNo() > deptno).toList();
		System.out.println(list);
	}
	
	// Find the employees which salary is > 3000 and <3000
	
	public void findTheEmpSal(double sal) {
		Map<Boolean, List<Employee>> greater = emps.stream().collect(Collectors.partitioningBy(e -> e.getSal()>sal));
		System.out.println(greater);
		
	}
}

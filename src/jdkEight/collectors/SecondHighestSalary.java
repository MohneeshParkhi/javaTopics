package jdkEight.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



record Employee  (int id, String name, int Salary) implements Comparator<Employee>{
    public int getSalary() {
    	return this.Salary;
    }
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() == o2.getSalary())
			return 0;
		if(o1.getSalary() > o2.getSalary()) {
			return 1; 
		}
		if(o1.getSalary() < o2.getSalary()) {
			return -1;
		}
		return 0;
	}
	
}
public class SecondHighestSalary {
public static void main(String[] args) {
	Employee emp = new Employee(1, "xyz", 10000);
	Employee emp1 = new Employee(1, "xyz", 30000);
	Employee emp2 = new Employee(1, "xyz", 700000);
	
	
	List<Employee> listEmp = new ArrayList<Employee>();
	
	listEmp.add(emp);
	listEmp.add(emp1);
	listEmp.add(emp2);
	
	 Optional<Employee> empO= listEmp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();
	 System.out.println(empO.get());
    
}
}

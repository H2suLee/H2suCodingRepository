package co.edu.company;

public class Manager extends Employee {
	@Override
	int getSalary() {
		return baseSalary+1000000;
	}
}

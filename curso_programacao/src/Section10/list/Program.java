package Section10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Section10.list.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("How many employees will be  registered? ");
		int N = sc.nextInt();
		
		
		for(int i=0; i < N; i++) {
			
			System.out.println("Employye #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			
		}
		
		System.out.print("Enter the Id of the employee who will receive a salary increase: ");
		int idSalary = sc.nextInt();		
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does'nt exist!");
		}
		
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}			
		}
		
		return null;
	}
	
	

}

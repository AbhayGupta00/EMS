package abhay.ss;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		String name = null;
		int rollNo = 0;
		int mobileNo = 0;
		String s1 = "y";
		String s2 = "y";
		Employee emp;
		System.out.println("Enter the details of employee:");
		for (int i = 0; i >= 0; i++) {
			if (s1.equalsIgnoreCase(s2)) {

				System.out.println("Enter the name of the employee:");
				name = scanner.next();
				System.out.println("Enter the roll no of the employee:");
				rollNo = scanner.nextInt();
				System.out.println("Enter the mobile no of the employee:");
				mobileNo = scanner.nextInt();

				if (mobileNo == 0) {
					emp = new Employee();
					emp.setname(name);
					emp.setRollno(rollNo);
				} else {
					emp = new Employee(name, rollNo, mobileNo);
				}
				list.add(emp);
			} else {
				break;
			}
			System.out.println("press y to add more employee");
			s2 = scanner.next();
		}
		list.stream().forEach(System.out::println);
		List<Employee> list1 = list.stream().filter(x -> x.getMobileno() != 0).collect(Collectors.toList());
		System.out.println("filtered list of Employee is-");
		list1.stream().forEach(System.out::println);
	}
}

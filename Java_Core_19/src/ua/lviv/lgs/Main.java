package ua.lviv.lgs;

import java.io.*;
import java.util.*;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Methods methods = new Methods();
		
		Employee emp01 = new Employee("John", 10, 10);
		
		methods.serialize(emp01);
		System.out.println(methods.deserialize());
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Sebastian", 10, 10));
		employees.add(new Employee("Lisitsyn", 10, 10));
		employees.add(new Employee("Alan", 10, 10));
		employees.add(new Employee("Catherine", 10, 10));
		employees.add(new Employee("Morgan", 10, 10));
		
		methods.serialize(employees);
		System.out.println(methods.deserialize());
	}
}

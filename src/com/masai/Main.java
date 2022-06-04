package com.masai;

public class Main {
	

	public static void main(String[] args) {
		
			 Employee e1 = new Employee();
			 e1.setEmployeeId(101);
			 e1.setEmployeeName("vivek");
			 e1.setSalary(20000);
			 e1.setNetSalary(18600);
			 
			 System.out.println("id :"+e1.getEmployeeId());
			 System.out.println("Name :"+e1.getEmployeeName());
			 System.out.println("Salary :"+e1.getNetSalary());
			 System.out.println("Net Salary :"+ e1.getSalary());
			 
		}


	}


package ebook;

public class Employee {

	private int id;

	private String name;

	private int salary;

	private String company;

	public Employee(int id, String name, int salary, String company) {

		this.id = id;

		this.name = name;

		this.salary = salary;

		this.company = company;

	}

	public int getId() { 

		return id; 

	}

    public String getName() { 

    	return name; 

    }

    public int getSalary() { 

    	return salary; 

    }

    public String getCompany() { 

    	return company; 

    }

}

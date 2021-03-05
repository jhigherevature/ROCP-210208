package com.revature.joseph.model;

/* 
 * Model Objects should mirror how the information would look in our 
 * database, on a per-record basis.
 * 
 * When we employ a DAO design pattern, it is typically useful to also
 * utilize a Java Bean pattern when creating your model objects.
 */
public class Employee {
	private Integer emp_id;
	private String emp_name;
	private Double emp_salary;
	private String emp_title;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer emp_id, String emp_name, Double emp_salary, String emp_title) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_title = emp_title;
	}
	
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public Double getEmp_salary() {
		return emp_salary;
	}
	
	public String getString_salary() {
		/*
		 * This method is used by our jsp to look at the salary
		 * as a String, so we can more easily showcase the salary of our users.
		 * 
		 * The String.format below is for decimal numbers (%f) that go out 
		 * 2 decimal places ( '.2' ) >> (%.2f)
		 */
		return String.format("$: %.2f", emp_salary);
	} 
	
	public void setEmp_salary(Double emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	public String getEmp_title() {
		return emp_title;
	}
	public void setEmp_title(String emp_title) {
		this.emp_title = emp_title;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emp_id == null) ? 0 : emp_id.hashCode());
		result = prime * result + ((emp_name == null) ? 0 : emp_name.hashCode());
		result = prime * result + ((emp_salary == null) ? 0 : emp_salary.hashCode());
		result = prime * result + ((emp_title == null) ? 0 : emp_title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_id == null) {
			if (other.emp_id != null)
				return false;
		} else if (!emp_id.equals(other.emp_id))
			return false;
		if (emp_name == null) {
			if (other.emp_name != null)
				return false;
		} else if (!emp_name.equals(other.emp_name))
			return false;
		if (emp_salary == null) {
			if (other.emp_salary != null)
				return false;
		} else if (!emp_salary.equals(other.emp_salary))
			return false;
		if (emp_title == null) {
			if (other.emp_title != null)
				return false;
		} else if (!emp_title.equals(other.emp_title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_title="
				+ emp_title + "]";
	}
}

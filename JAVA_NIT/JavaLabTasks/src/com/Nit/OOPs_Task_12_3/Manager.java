package com.Nit.OOPs_Task_12_3;

public class Manager {

	private int managerId;
	private String managerName;
	
	public Manager(Employee e)
	{
		this.managerId = e.getEmployeeNumber();
		this.managerName = e.getEmployeeName();
	}

	@Override
	public String toString() {
		return "Manager "
				+ "[managerId=" + managerId + ", "
						+ "managerName=" + managerName + "]";
	}

	
	
}

package payroll;

import java.math.BigDecimal;

public class Salaried extends Employee{
	
	protected BigDecimal weeklySalary;

	public void load(BigDecimal weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public Salaried getEarnings(){
		payCheck = weeklySalary;
		return this;
	}
	
}

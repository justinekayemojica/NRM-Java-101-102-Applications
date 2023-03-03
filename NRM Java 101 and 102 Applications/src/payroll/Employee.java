package payroll;

import java.math.BigDecimal;
import java.util.Calendar;

abstract class Employee {

	private String name;
	private String socialSecurityNumber;
	private Integer birthdayMonth;
	private Integer birthdayWeek;
	public BigDecimal payCheck;
	
	public void load(String name, String socialSecurityNumber, Integer birthdayMonth, Integer birthdayWeek) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthdayMonth = birthdayMonth;
		this.birthdayWeek = birthdayWeek;
	}
	
	public String toString() {		
		String payCheckReport = String.format("employee: %s %nsocial security number: %s %npaycheck: %s", name, socialSecurityNumber, payCheck); 		
		return payCheckReport;		
	}
	
	public void getBonus() {
		
		int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int currentWeek = Calendar.getInstance().get(Calendar.WEEK_OF_MONTH);
		
		if((birthdayMonth.equals(currentMonth)) && (birthdayWeek.equals(currentWeek))) {
			payCheck = payCheck.add(new BigDecimal(100));
		}
		
	}
		
	abstract Employee getEarnings();

}

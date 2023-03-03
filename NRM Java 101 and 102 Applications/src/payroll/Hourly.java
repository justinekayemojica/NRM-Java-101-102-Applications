package payroll;

import java.math.BigDecimal;

public class Hourly extends Employee{
	
	private BigDecimal hourlyPay;
	private Integer hoursWorkThePastWeek;
	

	public void load( BigDecimal hourlyPay, Integer hoursWorkThePastWeek) {
		this.hourlyPay = hourlyPay;
		this.hoursWorkThePastWeek = hoursWorkThePastWeek;
	}
	
	@Override
	public Hourly getEarnings() {
		BigDecimal earnings = BigDecimal.ZERO;
		BigDecimal otPay;
		int otHours;
		
		if( hoursWorkThePastWeek > 40) {
			otHours = 40 - hoursWorkThePastWeek;
			otPay = hourlyPay.multiply(new BigDecimal(1.5)).multiply(new BigDecimal(otHours)).setScale(0);
			earnings = hourlyPay.multiply(new BigDecimal(40)).add(otPay);
		} else {
			earnings = hourlyPay.multiply(new BigDecimal(hoursWorkThePastWeek));
		}
		payCheck = earnings;
		return this;
	}	

}

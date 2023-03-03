package payroll;

import java.math.BigDecimal;

public class SalariedPlusCommission extends Salaried{
	
	private int pastWeekSales;
	private BigDecimal commissionRate;
	
	
	@Override
	public void load(BigDecimal weeklySalary) {
		super.load(weeklySalary);
	}

	public void load(int pastWeekSales, BigDecimal commissionRate) {
		this.pastWeekSales = pastWeekSales;
		this.commissionRate = commissionRate.setScale(2);
	}
	
	@Override
	public SalariedPlusCommission getEarnings(){
		BigDecimal earnings;
		earnings = commissionRate.multiply(new BigDecimal(pastWeekSales)).add(weeklySalary);
		payCheck = earnings;
		return this;
	}	
	

}

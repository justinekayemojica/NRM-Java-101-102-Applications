package payroll;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PayrollDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Working Variables
		int numOfEmployee;
		Integer employeeType;
		String name;
		String ssn;
		int birthMonth;
		int birthWeek;
		List<String> payCheckReport = new ArrayList<>();
		Boolean isValidValue = false;
		
		do {
			try {
				System.out.print("Number of Employee: ");
				numOfEmployee = input.nextInt();
				if(numOfEmployee <= 0) {
					throw new IllegalArgumentException();
				}
				
				for(int employee = 1 ; employee <= numOfEmployee ; employee++) {
					System.out.println("PROFILE  FOR EMPLOYEE #" + employee);
					System.out.println("type Hourly(1), Salaried(2), Salaried plus Commission(3)");
					System.out.print("Enter 1, 2, 3 ==> ");
					employeeType = input.nextInt();
					
					if(employeeType < 1  || employeeType > 3) {
						throw new IllegalArgumentException();
					}
					
					input.nextLine();
					System.out.print("Name ==> " );
					name = input.nextLine();
					
					System.out.print("Social Security Number ==> " );
					ssn = input.nextLine();
					
					System.out.print("Birthday month (1-12) ==> " );
					birthMonth = input.nextInt();
					
					if(birthMonth < 1  || birthMonth > 12) {
						throw new IllegalArgumentException();
					}
					
					System.out.print("Birthday bonus week (1-4) ==> " );
					birthWeek = input.nextInt();
					
					if(employeeType < 1  || employeeType > 4) {
						throw new IllegalArgumentException();
					}
					
					switch(employeeType) {
					
					case 1: 	
						Hourly hourlyEmployee = new Hourly();
						hourlyEmployee.load(name, ssn, birthMonth, birthWeek);
						System.out.print("Hourly Pay ==> ");
						BigDecimal hourlyPay = input.nextBigDecimal().setScale(2);						
						System.out.print("Hours work this past week ==> ");
						Integer hoursWorkThePastWeek = input.nextInt();
						System.out.println();
						hourlyEmployee.load(hourlyPay, hoursWorkThePastWeek);
						hourlyEmployee.getEarnings().getBonus();
						payCheckReport.add(hourlyEmployee.toString());
						isValidValue = true;
						break;
						
						
						
					case 2: 
						Salaried salariedEmployee = new Salaried();
						salariedEmployee.load(name, ssn, birthMonth, birthWeek);
						System.out.print("Salary ==> ");
						BigDecimal weeklySalary = input.nextBigDecimal().setScale(2);
						System.out.println();
						salariedEmployee.load(weeklySalary);
						salariedEmployee.getEarnings().getBonus();
						payCheckReport.add(salariedEmployee.toString());
						isValidValue = true;
						break;
						
					case 3: 
						SalariedPlusCommission spcEmployee = new SalariedPlusCommission();
						spcEmployee.load(name, ssn, birthMonth, birthWeek);
						System.out.print("Salary ==> ");
						BigDecimal basedPay = input.nextBigDecimal().setScale(2);
						System.out.print("Sales for this past week ==> ");
						Integer pastWeekSales = input.nextInt();
						System.out.print("Sales commision rate ==> ");
						BigDecimal commRate = input.nextBigDecimal().setScale(2);
						System.out.println();
						spcEmployee.load(basedPay);
						spcEmployee.load(pastWeekSales, commRate);
						spcEmployee.getEarnings().getBonus();
						payCheckReport.add(spcEmployee.toString());
						isValidValue = true;
						break;
					
					}
					
				}
				
			} catch (InputMismatchException | IllegalArgumentException e) {
			 input.nextLine();
			 isValidValue = false;
			 System.out.println("Invalid Value");
			 
			}
			
		} while(isValidValue == false);

		
		for(String record : payCheckReport) {
			System.out.println(record);
			System.out.println();
		}
		
	
		input.close();

	}
	

}

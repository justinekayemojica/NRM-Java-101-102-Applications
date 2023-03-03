package calcPercentDecorInc;

import java.math.BigDecimal;
import java.util.Scanner;

public class StockChangeCalculator {
	
	public static void main(String[] args) {
		main();
	}
	
	
	static void main(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the stock symbol:  ");
		String stockSymbol = input.nextLine();
		System.out.print("Enter " + stockSymbol + "'s day 1 value: "  );
		float val1 = input.nextFloat();
		System.out.print("Enter " + stockSymbol + "'s day 1 value: "  );
		float val2 = input.nextFloat();
		float incOrDec = val2 - val1 ; 
		float percentChange = 100 * (incOrDec/val1);
		BigDecimal perChange = new BigDecimal(percentChange).setScale(2);
		System.out.println("AAPL has changed " + perChange + " %" + " in one day");
		input.close();
	}

}

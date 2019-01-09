import java.util.ArrayList;
import java.util.List;

public class RunMain {
/**
 * Add document
 * @param args
 */
	public static void main(String[] args) {
		TaxPayer[] taxPayers = {
				new EmployedPerson("Billy", "ssn-1123"),
				new MomPopShop("Coffeeshop", "corp-id")
		};
		
		double taxesCollectedAmt = 0;
		for(TaxPayer taxPayer : taxPayers) {
			taxesCollectedAmt += taxPayer.payTaxes();
		}
		
		System.out.printf("Taxes Collected: $%.2f", taxesCollectedAmt);

	}

}
